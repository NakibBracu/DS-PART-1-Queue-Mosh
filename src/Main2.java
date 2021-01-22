public class Main2 {
    public static void main(String[] args) {
     QueueWithTwoStacks queue = new QueueWithTwoStacks();
     queue.enqueue(10);
     queue.enqueue(20);
     queue.enqueue(30);
     queue.enqueue(40);
     var first = queue.dequeue();
        System.out.println(first);
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.peek());
    }
}
