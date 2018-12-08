package returnCollectionByMethod;

import java.util.ArrayList;
import java.util.Collection;

public class ReturnCollectionByMethod {
    public static void main(String[] args) {
        Collection<String> collection = getCollection();
        if (collection != null) {
            //some code
        }
    }

    static Collection<String> getCollection() {
        Collection<String> collection = new ArrayList<>();
        //some code
        return collection;
    }
}
