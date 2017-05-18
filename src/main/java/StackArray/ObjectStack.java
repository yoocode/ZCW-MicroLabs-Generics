package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;
    private int sizeOfElements;

    public ObjectStack() {
        elements = new Object[0];
        sizeOfElements = 0;
    }

    public void push (Object item){
        if(sizeOfElements == elements.length)
            elements = Arrays.copyOf(elements, elements.length + 5);
        elements[sizeOfElements++] = item;
    }

    public Object pop(){
        return elements[--sizeOfElements];
    }

    public boolean isEmpty(){
        return sizeOfElements ==0;
    }
}
