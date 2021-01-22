import java.util.LinkedList;
import java.util.Queue;
//ata youtube er solution
// video url :- https://youtu.be/XTouyMSE0Y8
public class StackWithQueues {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();
    private int size;
    private int top;
    public void enqueue1(int item){// O(n)
        // data will be always added to q2 for this algo
        q2.add(item);// always add items in q2 first
        size++;// increment size for adding new items
        // add all the datas from q1 to q2
        while (!q1.isEmpty())
            q2.add(q1.remove());
        swappingQueues();
    }
    public int dequeue1(){
        if(isEmpty()) throw new IllegalArgumentException();
        size--;
        return q1.remove();
    }
    public int size(){
        return size;
    }
    public int peek1(){
        return q1.peek();// ata vul
    }
    public int peek2(){
        return q2.peek();// ata vul
    }
    private boolean isEmpty(){
        return (q1.isEmpty());// as items remove from q1 in both ways
    }
    // now we can use another method by making pop operation heavy

   public void enqueue2(int item){
        //O(1)
       // add items in queue1 for this process 2
        q1.add(item);
        size++;
   }
   public int dequeue2(){
        if (isEmpty()) throw new IllegalArgumentException();
        while(q1.size()!=1)
            q2.add(q1.remove());
        size--;
        int ReturnValue = q1.remove();
       swappingQueues();
       return ReturnValue;
   }

    private void swappingQueues() {
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public static void main(String[] args) {
        StackWithQueues s1 = new StackWithQueues();
        s1.enqueue1(10);
        s1.enqueue1(20);
        s1.enqueue1(30);
        System.out.println(s1.peek1());
        System.out.println(s1.dequeue1());
        System.out.println(s1.peek1());
//        System.out.println(s1.dequeue1());
//        System.out.println(s1.dequeue1());
//        System.out.println(s1.size);
      //  System.out.println(s1.dequeue1());
//        s1.enqueue2(50);
//        s1.enqueue2(60);
//        s1.enqueue2(70);
//        System.out.println(s1.peek2());
//        System.out.println(s1.dequeue2());
//        System.out.println(s1.peek2());
//        System.out.println(s1.dequeue2());
//        //System.out.println(s1.dequeue2());
//        System.out.println(s1.peek2());
//        System.out.println(s1.size);
    }
}

