package useStandartExceptions;

public class UseStandartExceptions {
    public static void main(String[] args) {
        exceptionMethod(-5);
    }
    public static void exceptionMethod(int i){
        if(i<0)throw new IllegalArgumentException("i < 0");
    }
}
