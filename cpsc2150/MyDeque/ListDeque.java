package cpsc2150.MyDeque;

import java.util.*;

/**
 * Class implementation of the IDeque interface using a List
 */
public class ListDeque implements IDeque{
    // this time store the deque in a list
    // myQ.get(0) is the front of the deque
    private List<Integer> myQ;

    /**
     * Constructor that creates an empty list
     *
     * @post empty list is created
     */
    public ListDeque()
        { myQ = new ArrayList<Integer>(); }

    /**
     * Adds x to the end of the deque
     *
     * @param x Integer to be added to end of queue
     * @pre myQ.size() < IDeque.MAX_LENGTH
     * @post Last element in queue = x AND myQ.size() = #myQ.size() + 1
     */
    @Override
    public void enqueue(Integer x)
        { myQ.add(x); }

    /**
     * Removes and returns the integer at the front of the deque
     *
     * @return Integer object that returns first integer in queue
     * @pre myQ.size() > 0
     * @post myQ.size() = #myQ.size() - 1
     */
    @Override
    public Integer dequeue()
    {
        Integer frontInt = myQ.get(0);      // first element in the queue
        myQ.remove(0);      // removes front element
        return frontInt;
    }

    /**
     * Adds x to the front of the deque
     *
     * @param x Integer to be added to front of queue
     * @pre myQ.size() < IDeque.MAX_LENGTH
     * @post Last element in queue = x
     */
    @Override
    public void inject(Integer x)
        { myQ.add(0, x); }

    /**
     * Removes and returns the integer at the end of the deque
     *
     * @return Integer object that returns last integer in queue
     * @pre myQ.size() > 0
     * @post myQ.size() = #myQ.size() - 1
     */
    @Override
    public Integer removeLast()
    {
        Integer endInt = myQ.get(myQ.size() - 1);   // last element in the queue
        myQ.remove(myQ.size() - 1);     // removes last integer
        return endInt;
    }

    /**
     * Returns the number of integers in the deque
     *
     * @return int size of the queue
     * @post queue = #queue
     */
    @Override
    public int length()
        { return myQ.size(); }

    /**
     * Clears the entire deque
     *
     * @post queue is empty
     */
    @Override
    public void clear()
        { myQ.clear(); }
}