import java.util.Arrays;

public class CustomPriorityQueue {
    private int items[] = new int[5];
    private int count;
    public void add(int item){
     // As we set the priority of smaller number to be inserted at the beginning
     // [0,0,0,0,0] items
     // add(5)
     // add(1)
     // add(3)
     // the array should be [1,3,5,0,0]
     // that means we have to iterate from the last item of the array
     // if the item is less than the item exist in current index
     // that means we have to do right shift and for not missing any value we shift values from end of the array
     if(isFull())
         throw new IllegalStateException();
     var i = shiftItemsToInsert(item);
     items[i+1]=item;
     count++;
    }
    public boolean isFull(){
        return count== items.length;
    }
    public int shiftItemsToInsert(int item){
        int i;
        for(i=count-1;i>=0;i--){
            if(items[i]>item)
                items[i+1]=items[i];//shifting items
            else
                break;
        }
        return i+1;
    }
    public boolean isEmpty(){
        return count==0;
    }
    public int remove(){// considering highest number get the higher priority
        if(isEmpty())
            throw new IllegalStateException();
        return items[--count];
    }
    @Override
    public String toString(){
        return Arrays.toString(items);
    }

}
