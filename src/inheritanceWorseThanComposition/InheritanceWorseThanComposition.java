package inheritanceWorseThanComposition;

import java.util.*;

public class InheritanceWorseThanComposition {
    public static void main(String[] args) {
        InstrumentedSet<String> s = new InstrumentedSet<>();
        s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        System.out.println(s.getAddCount());
        Stack stack;
        Properties properties;
    }
}

class InstrumentedHashSet<E> extends HashSet<E> {
    private int addCount = 0;

    public int getAddCount() {
        return addCount;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean modifyed = false;
        for (E e: c)
        if (add(e))
            modifyed = true;
        return modifyed;
    }

    @Override
    public boolean add(E e) {
        if(e instanceof String)return false;
        addCount++;
        return super.add(e);
    }
    public boolean addNotNull(E e){
        return true;
    }
}


class InstrumentedSet<E>   {
    private int addCount = 0;
    private final Set<E> set=new HashSet<>();
    public boolean add(E e) {
        if(e instanceof String)return false;
        addCount++;
        return set.add(e);
    }
    public boolean addAll(Collection<? extends E> c) {
       addCount+=c.size();
       return set.addAll(c);
    }
    public int getAddCount() {
        return addCount;
    }
    public boolean addNonNull(){
        return true;
    }
}










