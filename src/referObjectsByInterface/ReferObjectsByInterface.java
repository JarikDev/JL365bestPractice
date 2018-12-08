package referObjectsByInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ReferObjectsByInterface {
    List<String > list=new ArrayList<>();//good
  static  Vector<String> vector=new Vector<>();//bad
    public static void main(String[] args) {
        ThreadLocal threadLocal;

    }
}
