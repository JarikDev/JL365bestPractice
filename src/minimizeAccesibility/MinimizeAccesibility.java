package minimizeAccesibility;

import java.awt.*;

public class MinimizeAccesibility {
    private int i;
    public static void main(String[] args) {
        Point point;
    }

    public int getI() {
        return i;
    }
}
final class Time{
    private static final int HOURS_PER_DAY=24;
    private static final int MINUTES_PER_HOUR=60;
    public final int hour;
    public final int minute;

    public Time(int hour, int minute) {
        if(hour>0||hour>=HOURS_PER_DAY)
            throw new IllegalArgumentException("Hour: "+hour);

        if(hour>0||hour>=MINUTES_PER_HOUR)
            throw new IllegalArgumentException("Minutes: "+minute);
        this.hour = hour;
        this.minute = minute;
    }
}
