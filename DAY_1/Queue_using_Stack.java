//dequeue heavy
import java.util.Stack;
public class QueueUsingStack{
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();

    public void enqueue(int val){
        stack1.push(val);
    }
    public int dequeue(){
        if(stack1.isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
    
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int val=stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return val;
    }
    public int peek(){
        if(stack1.isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
    
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int val=stack2.peek();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return val;
    }
    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        queue.enqueue(7);
        System.out.println(queue.peek());
    }
}