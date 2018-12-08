package overloadingUse;

import java.util.*;

public class OverloadingUse {
    void getStudentByID(Integer i){}
    void getStudentByID(int i){}
    public static String classify(Set<?> s){
        return "Set";
    }

    public static String classify(List<?> lst){
        return "List";
    }

    public static String classify(Collection<?> c){
        return "Unknown collection";
    }
  /*  public static void main(String[] args) {
        Collection<?>[] collections={
                new HashSet<String>(),
                new ArrayList<>(),
                new HashMap<String,String>().values()
        };
        for (Collection<?> c:collections) {
            System.out.println(classify(c));
        }
    }*/
//    public static String classify(Collection<?>c){
//        return c instanceof Set ? "Set": c instanceof List ? "List" : "Unknown collection";
//    }

    public static void main(String[] args) {
        Set<Integer>set=new TreeSet<Integer>();
        List<Integer>list=new ArrayList<Integer>();
        for (int i = -3 ; i < 3; i++) {
            set.add(i);
            list.add(i);
        }
        for (int i = 0 ; i < 3; i++) {
            set.remove(i);
            list.remove(i);
        }
        System.out.println(set+" "+list);
    }
}
