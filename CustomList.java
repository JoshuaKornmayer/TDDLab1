package TDDLab1;

import java.util.Arrays;
import java.util.List;

public class CustomList<E> implements List<E> {
    private Object[] internal = {};

    // empty implementation methods
    @Override
    public boolean isEmpty() {
        return internal.length == 0;

    }

    @Override
    public int size() {
        return internal.length;
    }

    @Override
    public E get(int index) {
        return (E) internal[index];
    }

    @Override
    public boolean add(E element) {
        Object[] temp = Arrays.copyOf(internal, internal.length + 1);
        temp[internal.length] = element;
        internal = temp;
        return true;
    }
}