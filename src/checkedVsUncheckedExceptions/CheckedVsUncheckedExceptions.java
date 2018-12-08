package checkedVsUncheckedExceptions;

public class CheckedVsUncheckedExceptions {
    public static void main(String[] args) throws Exception {
        CheckedVsUncheckedExceptions checkedVsUncheckedExceptions=new CheckedVsUncheckedExceptions();
        long time=System.currentTimeMillis();
        checkedVsUncheckedExceptions.doJob(10000);
        System.out.println(System.currentTimeMillis()-time);
    }
    public void doJob(long l)throws Exception{
        if(l>0){
            l--;
            doJob(l);
        }
    }
}
