package waitAndNotify;

public class WaitAndNotify {
    Object object;
    public void waitMethod()throws InterruptedException{
        synchronized (object){
            boolean condition=true;
            while (condition){object.wait();}
        }
    }
    public void notifyMethod(){
        object.notifyAll();
    }
}
