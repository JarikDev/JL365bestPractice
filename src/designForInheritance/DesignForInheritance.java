package designForInheritance;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Date;

public class DesignForInheritance {
    public static void main(String[] args) {
        AbstractCollection abstractCollection;
        AbstractList abstractList;
        Sub sub = new Sub();
        sub.overrideMe();

    }
}

class Super {
    public Super() {
        overrideMe();
    }

    void overrideMe() {
    }
}

class Sub extends Super {
    private final Date date;

    public Sub() {
        date = new Date();
    }

    @Override
    void overrideMe() {
        System.out.println(date);
    }
}