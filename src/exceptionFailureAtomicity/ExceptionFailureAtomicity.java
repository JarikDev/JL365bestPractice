package exceptionFailureAtomicity;

import java.util.EmptyStackException;

public class ExceptionFailureAtomicity {
    Object[] elements;

    public Object  pop(int size) {
        if (size == 0) throw new EmptyStackException();
        return elements[--size];
    }
}
