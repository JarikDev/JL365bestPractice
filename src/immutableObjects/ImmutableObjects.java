package immutableObjects;

import java.util.Date;

public class ImmutableObjects {
    public static void main(String[] args) {
        Date start=new Date();
        Date end=new Date();//hack happens
        Period p=new Period(start,end);
        Date start1=p.start();
        start1.setTime(0);//immutable changed
    }
}
final class Period{
    private final long start;
    private final long end;
    public Period(Date start, Date end) {
        this.start =  start.getTime() ;
        this.end =  end.getTime() ;
        if(this.start<this.end)
            throw new IllegalArgumentException(start+" after "+end);
    }
    public Date start() {
        return new Date(start );
    }
    public Date end() {
        return new Date(end );
    }
}
//class MyDate extends Date{
//    @Override
//    public Object clone() {
//        //some bad code
//        return super.clone();
//    }
//}