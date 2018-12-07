package overridingEquals;

import sun.security.util.Cache;

public class OverridingEquals {
//    String s;
 int x;
//    public OverridingEquals(String s) {
//        this.s = s;
//    }

    public static void main(String[] args) {
        //symmetric
//        System.out.println(new OverridingEquals("").equals(""));
//        System.out.println("".equals(new OverridingEquals("")));
        //transitive
        System.out.println(new OverridingEquals ().equals(new OverridingEqualsSub()));
        System.out.println(new OverridingEqualsSub ().equals(new OverridingEquals()));
        OverridingEqualsSub overridingEqualsSub=new OverridingEqualsSub();
        overridingEqualsSub.y=5;
        System.out.println(new OverridingEqualsSub().equals(overridingEqualsSub));
        System.out.println(new OverridingEquals().equals(overridingEqualsSub));
    }

    @Override
    public boolean equals(Object obj) {
//reflexive x.equals(x) true
        //return new Random().nextBoolean();
        //symmetric x.equals(y)=y.equals(x)
//        if (obj instanceof OverridingEquals) return s.equalsIgnoreCase(((OverridingEquals) obj).s);
//        if (obj instanceof String)//One-way interoperability!
//            return s.equalsIgnoreCase((String) obj);
//        return false;
        //transitive x.equals(y) and y.equals(z) then x.equals(z)
        if(obj ==null || obj.getClass()!=getClass())return false;
//        if(!(obj instanceof OverridingEquals)) return false;
        OverridingEquals oe=(OverridingEquals)obj;
        return x==oe.x;
    }
}
class OverridingEqualsSub extends OverridingEquals{
    int y;

    @Override
    public boolean equals(Object obj) {
        if(obj==null||obj.getClass()!=getClass())return false;
//        if(!(obj instanceof OverridingEquals )) return false;
//        if(!(obj instanceof OverridingEqualsSub)) return obj.equals(this);
//        if(!(obj instanceof OverridingEqualsSub)) return false;
//        if(obj==null)return false;//redundant
        return super.equals(obj)&& y==((OverridingEqualsSub)obj).y;
    }
}