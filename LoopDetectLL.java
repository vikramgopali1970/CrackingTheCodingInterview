package CrackingTheCodingInterview;

import java.util.Random;

public class LoopDetectLL<T> {
    //Rabbit and Hare Algorithm

    Entry<T> head;
    Random r = new Random();
    int loopIndex;
    int counter;
    Entry<T> temp;
    int printCounter;
    int size;

    public void createLoop(){
        Entry<T> ptr = this.head;
        while(null != ptr.next){
            ptr=ptr.next;
        }
        ptr.next = temp;
    }

    public void insertAtEnd(T x){
        this.counter++;
        Entry<T> ptr = this.head;
        while(null != ptr.next){
            ptr=ptr.next;
        }
        ptr.next = new Entry(x);
        if(this.counter == this.loopIndex){
            temp = ptr.next;
        }
        this.size++;
    }

    static class Entry<E>{
        E val;
        Entry<E> next;

        public Entry(E val){
            this.val = val;
            this.next = null;
        }
    }

    public LoopDetectLL(){
        this.head = new Entry<T>(null);
        this.loopIndex = r.nextInt(11);
        this.counter=0;
        this.printCounter = 0;
        this.size = 0;
    }

    public String toString(){
        StringBuilder strb = new StringBuilder();
        Entry<T> ptr = this.head;
        strb.append("Head");
        while(null != ptr.next){
            this.printCounter++;
            ptr=ptr.next;
            strb.append("-->"+ptr.val);
            if(this.printCounter == (2*this.size)){
                break;
            }
        }
        return strb.toString();
    }

    public T detectLoop(){
        Entry<T> rabbit = this.head;
        Entry<T> hare = this.head;

        // run hare at twice the speed of rabbit to get the meeting point
        while(null != hare.next){
            hare = hare.next.next;
            rabbit = rabbit.next;
            if(rabbit == hare){
                break;
            }
        }

        // no loop was found
        if(null == hare.next){
            return null;
        }

        //with k distance between hare and rabbit move them at same speed
        //they will meet at loop start
        rabbit = this.head;
        while(rabbit != hare){
            rabbit = rabbit.next;
            hare = hare.next;
        }
        return rabbit.val;
    }
}
