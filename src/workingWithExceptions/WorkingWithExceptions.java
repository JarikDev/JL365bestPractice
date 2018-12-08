package workingWithExceptions;

public class WorkingWithExceptions {
    public static void main(String[] args) {
        try {
            System.out.println("Hello");
        }catch (Exception e){
            System.out.println("args: "+args+" length: "+args.length);
        }
    }
}
