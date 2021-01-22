import java.util.PriorityQueue;

public class Main3 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(30);
        queue.add(20);
        queue.add(1);
        System.out.println(queue);
        while (!queue.isEmpty())
            System.out.println(queue.remove());
        System.out.println("Custom class started");
        CustomPriorityQueue queue1 = new CustomPriorityQueue();
        queue1.add(10);
        queue1.add(1);
        queue1.add(5);
        queue1.add(4);
        queue1.add(3);
        System.out.println(queue1);//[1,3,4,5,10]
        System.out.println(queue1.remove());
    }
}
