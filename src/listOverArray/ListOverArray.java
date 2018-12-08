package listOverArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListOverArray {
    public static void main(String[] args) {
        List list;
        List<String> list2;
        System.out.println(numElementsInCommon(new HashSet(),new HashSet()));

        List  aClass = new ArrayList () ;
        System.out.println(aClass.getClass());
        System.out.println(aClass instanceof List);
        if(aClass instanceof List){
            List<?> y=aClass;
        }
    }
    static int numElementsInCommon(Set<?> s1,Set<?> s2){
        int result =0;
        for (Object o1:s1)
            if(s2.contains(01))
                result++;
            return result;
    }
}
