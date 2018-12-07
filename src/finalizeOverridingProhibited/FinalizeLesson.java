package finalizeOverridingProhibited;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class FinalizeLesson {
    Resource resource;
    Logger logger;

    public static void main(String[] args) {
        //dont use
        //its cost
        //log errors
        //native methods
        //guardian method
//        long begin =System.currentTimeMillis();
//        List<FinalizeLesson>list=new ArrayList<>();
//        for (int i = 0; i < 1000000; i++) {
//            list.add(new FinalizeLesson());
//
//        }
//        System.out.println(System.currentTimeMillis()-begin );
//    }
       /* try {
            resource.use;
        } finally {
            resource.close();

        }*/
    }

//    @Override
//    protected void finalize() throws Throwable {
//        try{
//        if (resource.isOpen()) {
//            logger.log(logger.getLevel(), "something went wrong");
//        }}finally {
//            super.finalize();
//        }
//    }
        private final Object finalizeGuardian=new Object(){
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
        }
    };
}
