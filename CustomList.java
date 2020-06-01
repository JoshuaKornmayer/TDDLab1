package TDDLab1;

import java.util.List;

public class CustomList<E> implements List<E> {
    private Object[] internal = {};

    // empty implementation methods
    @Override
    public boolean isEmpty() {
        if (internal.length != 0) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public boolean add(E element) {
        internal = new Object[] { element };

        return false;
    }
}