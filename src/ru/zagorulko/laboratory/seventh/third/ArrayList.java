package ru.zagorulko.laboratory.seventh.third;

import java.util.AbstractList;


public class ArrayList<E> extends AbstractList<E> {
    private Object[] elements;
    private int freeIndex;
    private int size;

    public ArrayList() {
        elements = new Object[10];
        freeIndex = 0;
        size = 0;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        final E e = (E) elements[index];

        return e;
    }

    public E remove(int index) {
        E e = get(index);

        System.arraycopy(elements, index + 1, elements, index, size - index);

        elements[size] = null;

        size--;
        freeIndex--;

        return e;
    }

    public void add(int index, E element) {
        if (freeIndex >= elements.length) {
            Object[] newElements = new Object[elements.length << 1];

            System.arraycopy(elements, index, newElements, index + 1, size - index);

            if (index > 0) {
                System.arraycopy(elements, 0, newElements, 0, index);
            }

            newElements[index] = element;

            for (int i = 0; i < elements.length; i++)
                elements[i] = null;

            elements = newElements;

        } else {
            System.arraycopy(elements, index, elements, index + 1, size - index);
            elements[index] = element;
        }

        size++;
        freeIndex++;
    }

    public boolean add(E element) {
        if (freeIndex >= elements.length) {
            Object[] newElements = new Object[elements.length << 1];

            System.arraycopy(elements, 0, newElements, 0, size);

            for (int i = 0; i < size; i++)
                elements[i] = null;

            elements = newElements;
        }

        elements[freeIndex] = element;

        size++;
        freeIndex++;

        return true;
    }


}
