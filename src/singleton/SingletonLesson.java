package singleton;

import java.io.Serializable;

public class SingletonLesson implements Serializable{
    enum MySingleton{
        INSTANCE;
        public void doJob(){

        }
    }

    private  static final SingletonLesson singleton=new SingletonLesson();
    private SingletonLesson() {
    }
    private Object readResolve(){return singleton;}
    public static SingletonLesson getInstance(){return singleton;}
    public static void main(String[] args) {
//        singleton.someMethod();
//        somOtherLocalMethod(singleton);
        SingletonLesson.getInstance();
    }
}
