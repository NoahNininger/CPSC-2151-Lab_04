package cpsc2150.MyDeque;

/**
 * A deque containing integers.
 * A deque is a double-ended queue data structure that allows you
 * to insert and remove from both ends.
 * This deque is bounded by MAX_LENGTH
 *
 * Initialization Insures:
 *      Queue is empty when initialized
 */
public interface IDeque {
    public static final int MAX_LENGTH = 100;

    /**
     * Adds x to the end of the deque
     *
     * @param x Integer to be added to end of queue
     * @pre Length of queue < MAX_LENGTH
     * @post Last element in queue = x
     */
    public void enqueue(Integer x);


    /**
     * Removes and returns the integer at the front of the deque
     *
     * @return Integer object that returns first integer in queue
     * @pre Length of queue > 0
     * @post Length of queue = #Length() - 1
     */
    public Integer dequeue();

    /**
     * Adds x to the front of the deque
     *
     * @param x Integer to be added to front of queue
     * @pre Length of queue < MAX_LENGTH
     * @post Last element in queue = x
     */
    public void inject(Integer x);

    /**
     * Removes and returns the integer at the end of the deque
     *
     * @return Integer object that returns last integer in queue
     * @pre Length if queue > 0
     * @post Length of queue = #Length of queue - 1
     */
    public Integer removeLast();

    /**
     * Returns the number of integers in the deque
     *
     * @return int size of the queue
     * @post queue = #queue
     */
    public int length();

    /**
     * Clears the entire deque
     *
     * @post queue is empty
     */
    public void clear();
}