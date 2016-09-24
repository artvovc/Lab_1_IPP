package com.lab3ipp.iterator;

/**
 * Created by Artemie on 24.09.2016.
 */
public class Repository implements Container {
    private String[] marks = {"toyota", "mercedes"};

    @Override
    public Iterator getIterator() {
        return new IteratorImpl();
    }

    private class IteratorImpl implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < marks.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) return marks[index++];
            return null;
        }
    }
}
