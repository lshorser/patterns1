package iterator.with_iterator;

import java.util.*;

class MultiplesIterator implements Iterator {
    private int base;
    private int next;
    private int top;

    /** Return an iterator of Integers that are multiples of i in
     the range 0 .. n - 1. */
    public MultiplesIterator(int i, int n) { //e.g., i = 2, n = 100
        base = i;
        top = n;
    }

    public Object next() {
        int n = next;
        next = next + base; // set up for the next time you call this method
        return n;
    }

    public boolean hasNext() {
        return next < top;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}