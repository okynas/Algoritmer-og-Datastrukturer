/**
 * Defines the interface to a stack collection.
 *
 * @author Lewis and Chase
 * @version 4.0
 */
public interface StackADT<T> {
    /**
     * Adds the specified element to the top of this stack. 
     * @param element element to be pushed onto the stack
     */
    void push(T element);

    /**
     * Removes and returns the top element from this stack. 
     * @return the element removed from the stack
     */
    T pop() throws EmptyCollectionException;

    /**
     * Returns without removing the top element of this stack. 
     * @return the element on top of the stack
     */
    T peek() throws EmptyCollectionException;

    /**
     * Returns true if this stack contains no elements. 
     * @return true if the stack is empty
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in this stack. 
     * @return the number of elements in the stack
     */
    int size();

    /**
     * Increase the capacity of the stack.
     */
    void expandCapacity();

    /**
     * Returns a string representation of this stack. 
     * @return a string representation of the stack
     */
    String toString();
}