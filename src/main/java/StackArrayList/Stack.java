package StackArrayList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {

    private ArrayList<E> elements;


    public Stack() {
        elements = new ArrayList<E>();
    }

    public void push(E item) {
        elements.add(item);
    }

    public E pop() {
        E removedElement = (E) elements.remove(elements.size() - 1);
       // elements = Arrays.copyOf(elements, 0, elements.size() - 1);
        return removedElement;
    }

    public boolean isEmpty() {
        return elements.isEmpty();

    }
}

