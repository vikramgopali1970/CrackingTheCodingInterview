package CrackingTheCodingInterview;

import java.util.Stack;

public class QueueStack<T> {
    Stack<T> queue;

    public QueueStack(){
        this.queue = new Stack<T>();
    }

    public void enque(T x){
        this.queue.push(x);
    }

    public T dequeue(){
        return dequeueHelper();
    }

    private T dequeueHelper() {
        if(this.queue.size() == 1){
            return this.queue.pop();
        }
        T temp = this.queue.pop();
        T dequeue = dequeueHelper();
        this.queue.push(temp);
        return dequeue;
    }

    public void printStack(){
        System.out.println(this.queue);
    }

}
