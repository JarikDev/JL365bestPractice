package overridingToString;

public class OverridingToString {
    int i;
    int x;
    int y;
    public static void main(String[] args) {
        OverridingToString overridingToString=new OverridingToString();
        overridingToString.i=5;
        try {
            throw new RuntimeException();
        }catch (RuntimeException e){
            System.out.println(overridingToString);
//            System.out.println(overridingToString.i+" x value "+ overridingToString.x+ " y value "+overridingToString.y); //dont do like this
        }
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "OverridingToString{" + "i=" + i + '}';
    }
}
