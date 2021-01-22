import java.util.Stack;

public class QueueWithTwoStacks {
    // Popular Interview Question
    // Here we have to build queue with stacks
    // But there is a problem
    // queue is FIFO and Stack is LIFO
    // But we can use at least two Stacks to solve this problem
    // One Stack will be dedicated for enqueue and other one is for dequeue
    // suppose Q[10,20]
    // S1 for enqueue S1 [10,20]
    // S2 will store the value from S1 in reverse order that means we have to pop from S1
    // S2 [20,10] now if we pop from S2 as dequeue then we get 10 which is like queue FIFO
    // But there is a problem with dequeue
    // if S2 pop 10 then S2 = [20] , Here if we enqueue 30 now in S1=[20,30] it will confused us where to add those and it will mess up the whole idea
    // so we have to pop all items from S1 and push it to s2 then only it will be resolved
    Stack<Integer> stack1 = new Stack<>();// for enqueue
    Stack<Integer> stack2 = new Stack<>();// for dequeue
    public void enqueue(int item){
        stack1.push(item);// 0(1)
    }
    public int dequeue(){
        if(isEmpty()) throw new IllegalStateException();
        moveStack1toStack2();
        return stack2.pop();
    }
    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }
    public int peek(){
        if(isEmpty()) throw new IllegalStateException();
        moveStack1toStack2();
        return stack2.peek();
    }

    private void moveStack1toStack2() {
        if (stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
    }


}
