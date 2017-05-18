package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;
    private int sizeOfElements;

    @SuppressWarnings("Unchecked")//telling the compiler that this will be legal at execution time
    public GenericStack() {
        elements = (E[]) new Object[0];
        sizeOfElements = 0;
    }

    public void push(E itme) {
        if (sizeOfElements == elements.length)
            elements = Arrays.copyOf(elements, elements.length + 5);
        elements[sizeOfElements++] = itme;
    }

    public E pop(){
        return elements[--sizeOfElements];
    }

    public boolean isEmpty(){
        return sizeOfElements == 0;
    }


}
