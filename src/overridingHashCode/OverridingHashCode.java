package overridingHashCode;

import java.util.HashMap;
import java.util.Map;

public class OverridingHashCode {
    int id;
    int j;
   //dont use
    public static void main(String[] args) {
        Map<OverridingHashCode,String> map=new HashMap<  >();
        map.put(new OverridingHashCode(),"one");
        System.out.println(map.get(new OverridingHashCode()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OverridingHashCode that = (OverridingHashCode) o;

        return id == that.id && j==that.j;
    }

    @Override
    public int hashCode() {
//        int result=17;
//        result=31*result+i;
//        result=31*result+x;
        return  id;
    }
}
