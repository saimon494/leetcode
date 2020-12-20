package com.leet.hash;

import java.util.*;

public class MyHashSetOnArray<T> implements Iterable<T> {

    private static class MyArray<T> implements Iterable<T> {

        private Object[] container;
        private int size = 1;
        private int modCount = 0;
        private int index = 0;

        public MyArray() {
            container = new Object[size];
        }

        private void add(int model) {
            modCount++;
            if (index >= size) {
                size++;
                container = Arrays.copyOf(container, size);
            }
            container[index++] = model;
        }

        private void remove(int index) {
            Objects.checkIndex(index, this.index);
            container[index] = null;
            this.index--;
            System.arraycopy(container, index + 1, container, index, this.index - index);
        }

        @Override
        public Iterator<T> iterator() {
            return new Iterator<T>() {
                private int point = 0;
                private int expectedModCount = modCount;

                @Override
                public boolean hasNext() {
                    return point < index;
                }

                @Override
                public T next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    if (expectedModCount != modCount) {
                        throw new ConcurrentModificationException();
                    }
                    return (T) container[point++];
                }
            };
        }
    }

    private MyArray<T> list = new MyArray<>();

    public void add(int key) {
        if (!contains(key)) {
            list.add(key);
        }
    }

    public void remove(int key) {
        if (contains(key)) {
            list.remove(key);
        }
    }

    public boolean contains(int key) {
        for (T elem : list) {
            if (elem.equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
