package callAlienMethodsFromSyncContext;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallAlienMethodsFromSyncContext {
    public static void main(String[] args) {
        ObservableSet<Integer>set=new ObservableSet<>(new HashSet<Integer>());
        set.addObserver(new SetObserver<Integer>() {
            @Override
            public void added(ObservableSet<Integer> set, Integer element) {
                System.out.println(element);
              //  if(element==20) set.removeObserver(this);
                if(element==20){
                ExecutorService executor= Executors.newSingleThreadExecutor();
                final SetObserver<Integer>observer=this;
                    try {
                        executor.submit(new Runnable() {
                            @Override
                            public void run() {
                                set.removeObserver(observer);
                            }
                        }).get();
                    } catch (ExecutionException | InterruptedException e) {
                        throw new   AssertionError(e.getCause());
                    } finally  {
                        executor.shutdown();
                    }
                }
            }
        });
        for (int i = 0; i < 100; i++) {
            set.add(i);
        }
    }
}
class ObservableSet<E> extends HashSet<E>{
    public ObservableSet(Set<E> set) {super(set); }
    private final List<SetObserver<E>> observers=new ArrayList<>();
//    private final List<SetObserver<E>> observers=new CopyOnWriteArrayList<>();
    public synchronized void addObserver(SetObserver<E> observer){
        observers.add(observer);
    }
    public synchronized boolean removeObserver(SetObserver<E> observer){
        return observers.remove(observer);
    }

    private synchronized void notifyElementAdded(E element){
        List<SetObserver<E>> snapshot=null;
        synchronized (observers){
            snapshot=new ArrayList<>(observers);
        }
        for (SetObserver<E> observer:snapshot) {
            observer.added(this,element);
        }
//        for(SetObserver<E> observer:observers){
//            observer.added(this,element);
//        }
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean result=false;
        for (E element:c) {
            result=add(element);
        }
        return result;
    }

    @Override
    public boolean add(E element) {
        boolean added=super.add(element);
        if(added)notifyElementAdded(element);
        return added;
    }
}
interface SetObserver<E>{
    void added(ObservableSet<E> set,E element);
}