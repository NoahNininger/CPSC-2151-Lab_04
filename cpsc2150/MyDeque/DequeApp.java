package cpsc2150.MyDeque;

import java.util.*;

public class DequeApp {
    public static void main(String args[]) {
        IDeque q;

        /*
        Prompt  the  user  to  pick  an  implementation  using  the  following
        message:  "Enter  1  for  array  implementation  or  2  for  List
        implementation"

        Your code needs to make sure that they only enter either 1 or 2.
        Re-print the message to prompt the user to enter it again. Once
        you have gotten an answer, use it to initialize q appropriately.
        */
        //create scanner object to take in user input
        Scanner scan = new Scanner(System.in);

        //prompt user for input
        System.out.println("Enter 1 for array implementation or 2 for List implementation");
        int userInput = scan.nextInt(); // reads user input

        while((userInput != 1) && (userInput != 2))     // input validation
        {
            System.out.println("Enter 1 for array implementation or 2 for List implementation");
            userInput = scan.nextInt();
        }

        if(userInput == 1) // Array
            { q = new ArrayDeque(); }
        else            // List
            { q = new ListDeque(); }

        Integer x = 3;
        q.enqueue(x);
        x = -8;
        q.enqueue(x);
        x = 15;
        q.enqueue(x);
        x = 0;
        q.enqueue(x);
        x = -4;
        q.enqueue(x);

        //Add  the  code  to  print  the  deque.  After  the  code  is  finished,
        //the deque should still contain all its values in order

        Integer element;

        System.out.print("<");
        for(int i = 0; i < q.length(); i++)     // loops through the queue
        {
            element = q.dequeue();      // sets element to front of queue

            // prints current element
            if(i == 0)
                { System.out.print(element); }      // first element
            else
                { System.out.print(", " + element); }
            q.enqueue(element);
        }
        System.out.println(">");
    }
}