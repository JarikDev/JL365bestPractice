package interfacesOverAbstractClasses;

import singleton.SingletonLesson;

import java.io.Serializable;
import java.util.*;

public class InterfacesOverAbstractClasses implements Cloneable,Serializable{
    public static void main(String[] args) {
        AbstractCollection abstractCollection;
        AbstractSet abstractSet;
        AbstractList abstractList;
        AbstractMap abstractMap;

    }
}
interface Artist{}
interface Singer{}
interface ArtistSinger extends Artist, Singer{}
class MyList extends AbstractList<Integer>{
    final int[]a;
    public MyList(int[] a) {
        this.a = a;
    }
    public Integer get(int index) {
        return a[index];
    }
    @Override
    public Integer set(int index, Integer val) {
        int oldVal=a[index];
        a[index]=val;
        return oldVal;
    }
    @Override
    public int size() {
        return a.length;
    }
}