import java.util.Arrays;

public class ArrayQueue {
    private int queue[];
    private int front,rear,count;
    public ArrayQueue(int capacity){
        queue = new int[capacity];
    }
    public void enqueue(int item){
        //Here rear is needed because in rear the items inserted everytime
        if(isFull()) throw new IllegalStateException();
        queue[rear]=item;
        rear=(rear+1)%queue.length;
        count++;//it will help to count the items that is inserted
    }
    public int dequeue(){
        if(isEmpty()) throw new IllegalStateException();
       var first = queue[front];
       queue[front]=0;
       front = (front+1)%queue.length;
       count--;
       return first;
    }
    private boolean isEmpty(){
        return count==0;//count 0 means no items is inserted
    }
    private boolean isFull(){
        return count==queue.length;
    }
    public int peek(){
        if(isEmpty()) throw new IllegalStateException();
        return queue[front];
    }
    @Override
    public String toString(){
        return Arrays.toString(queue);
    }
}
