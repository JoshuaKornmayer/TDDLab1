package TDDLab1;

import java.util.List;

public class CustomList<E> implements List<E> {
    private Object[] internal = {};

    // empty implementation methods
    @Override
    public boolean isEmpty() {
        return internal.length == 0;

    }

    @Override
    public boolean add(E element) {
        internal = new Object[] { element };

        return false;
    }

    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
            return internal.length;
        }

    }
}