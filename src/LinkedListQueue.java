import java.util.ArrayList;

public class LinkedListQueue {

    private class Node{
        private Node next;
        private int value;
     public Node(int value){
         this.value=value;
     }
    }
    private Node head;
    private Node tail;
    private int count;
    //O(1)
    public void enqueue(int value){
        Node NewNode = new Node(value);
        if(isEmpty()){
            head=tail=NewNode;
        }
        else{
            tail.next=NewNode;
            tail = NewNode;
        }
        count++;
    }
    //O(1)
    public int dequeue(){
        if(isEmpty())
            throw new IllegalArgumentException();
        int value;
        if(head==tail){
        value = head.value;
        head=tail=null;
        }
        else {
            value=head.value;
            var second = head.next;
            head.next=null;
            head=second;
        }
        return value;
    }
    // O(1)
    public boolean isEmpty() {
        return head == null;
    }
    //O(1)
    public int peek(){
        return head.value;
    }
    // O(1)
    public int size() {
        return count;
    }
    // O(n)
    public String toString() {
        ArrayList<Integer> list = new ArrayList<>();

        Node current = head;
        while (current != null) {
            list.add(current.value);
            current = current.next;
        }

        return list.toString();
    }
}
