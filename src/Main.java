import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        System.out.println(queue);
////        System.out.println(queue.remove());
////        System.out.println(queue);
//        reverse(queue);
//        System.out.println(queue);
        ArrayQueue a = new ArrayQueue(5);
        a.enqueue(10);//[10]
        a.enqueue(20);//[10,20]
        a.enqueue(30);//[10,20,30]
        System.out.println(a.dequeue());//10, then [20,30]
        var front = a.dequeue();//20 dequeue, then [30]
        System.out.println(front);
        System.out.println(a);
        a.enqueue(40);
        a.enqueue(50);
        a.enqueue(60);
        a.enqueue(70);
      //  a.enqueue(80); it should give an exception cause [60,70,30,40,50] queue full
        System.out.println(a);
    }
    public static void reverse(Queue<Integer> queue){
        //add , remove an isEmpty methods to build this method
        if(queue.isEmpty()) throw new IllegalArgumentException();
        // Idea is that we use both stack and queue to implement this
        // Queue = [10,20,30]
        // Stack = []
        //Now remove every items from queue and push to stack
        // Then Stack = [10,20,30] and Queue = []
        // Again pop every items from stack and enqueue it to the Queue
        // Then it will like Stack = [],Queue = [30,20,10]
        // We easily use stack to reverse anything cause it is LIFO structured
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.empty())
            queue.add(stack.pop());

    }
}
