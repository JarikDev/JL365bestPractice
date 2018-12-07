package immutableClasses;

import java.awt.*;
import java.time.LocalDate;
import java.util.Date;

public class ImmutableClasses {
   private int i;
    public int getI() {
        return i;
    }
    private ImmutableClasses(int i) {
        this.i = i;
    }
    public static   ImmutableClasses getInstance(int i){
        return new ImmutableClasses(i);
    }
    public static void main(String[] args) {
        Point point;//mutable
        Date date;//mutable
        LocalDate localDate;//immutable
    }
}
