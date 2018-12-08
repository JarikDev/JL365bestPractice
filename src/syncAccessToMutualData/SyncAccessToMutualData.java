package syncAccessToMutualData;

import java.util.concurrent.TimeUnit;

public class SyncAccessToMutualData {
    private static boolean stopRequested;

    public synchronized static boolean isStopRequested() {
        return stopRequested;
    }

    public synchronized static void setStopRequested(boolean stopRequested) {
        SyncAccessToMutualData.stopRequested = stopRequested;
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                    while ((!isStopRequested())) {
                    }
                }
        }).start();
        TimeUnit.SECONDS.sleep(1);
        setStopRequested(true)    ;
    }
}
