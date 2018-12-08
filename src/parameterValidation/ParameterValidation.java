package parameterValidation;

import java.math.BigInteger;

public class ParameterValidation {
    String s;
    public static void main(String[] args) {
            new ParameterValidation().doJob(-5,null);
            BigInteger bigInteger=new BigInteger("5");
    }

    /**
     * throws AriphmeticException
     * need normal params
     * @param i
     * @param s
     */
    void doJob(int i, String s){
        if(i<=0)throw new ArithmeticException("i= "+i);
        if(s==null)throw new IllegalArgumentException("s is null");
        //some job
        otherMethod(s);
    }
    void otherMethod(String s){
        oneMoreMethod(s);
    }
    void oneMoreMethod(String s){
        this.s=s;
//        System.out.println(s.length());
    }
    private void method(String s){
        assert s!=null;
    }
}
