package immutableObjects;

import java.util.Date;

public class ImmutableObjectsWithHack {
    public static void main(String[] args) {
        Date start=new Date();
        Date end=new MyDate2();//hack happens
        Period2 p=new Period2(start,end);
        Date start1=p.start();
        start1.setTime(0);//immutable changed
    }
}
final class Period2{
    private final Date start;
    private final Date end;
    public Period2(Date start, Date end) {
        if(start.compareTo(end)>0)
            throw new IllegalArgumentException(start+" after "+end);
        this.start = (Date)start.clone();
        this.end = (Date)end.clone();
    }
    public Date start() {
        return (Date)start.clone();
    }
    public Date end() {
        return (Date)end.clone();
    }
}
class MyDate2 extends Date{
    @Override
    public Object clone() {
        //some bad code
        return super.clone();
    }
}