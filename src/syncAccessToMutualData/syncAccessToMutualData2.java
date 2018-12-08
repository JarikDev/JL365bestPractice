package syncAccessToMutualData;

import java.util.concurrent.TimeUnit;

class SyncAccessToMutualData2 {
    private volatile static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while ((!stopRequested)) {
                }
            }
        }).start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
