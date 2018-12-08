package supressWarning;

import java.util.HashSet;
import java.util.Set;


public class SupressWarning {
    public static void main(String[] args) {
        run();
    }
    public static Set<String> run(){
        @SuppressWarnings("unchecked")
        Set<String> exaltation=new HashSet<>();
        return exaltation;

    }
}
