package Queue;

public interface QueueADT<T> {

    public void enqueue(T element);

    public T dequeue();

    public T first();

    public boolean isEmpty();

    public int size();

    public void expandCapacity();

    public String toString();

}
