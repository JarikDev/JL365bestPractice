package overridingClone;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OverridingClone implements Cloneable {
    int i;
      Object[]objects;
    private Date creationTime;
    public OverridingClone(OverridingClone overridingClone){
        this.i=overridingClone.i;
        this.objects=overridingClone.objects;
        creationTime=new Date();
    }
    public OverridingClone(){}
    public static void main(String[] args) throws CloneNotSupportedException {
        OverridingClone overridingClone=new OverridingClone( );
        Object clone =overridingClone.clone();
        System.out.println(overridingClone!=clone);
        System.out.println(overridingClone.getClass()==clone.getClass());
//        System.out.println(overridingClone.equals(clone));// not mandatory
        List list=new ArrayList<>();
        List list2=new ArrayList<>(list);
    }

    @Override
    protected OverridingClone clone() throws CloneNotSupportedException {
        OverridingClone result= (OverridingClone)  super.clone();
        result.objects=this.objects;
        return result;
    }
}
