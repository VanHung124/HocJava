package T3.B3;

import java.util.LinkedList;

public class Queue<Q> {

    private LinkedList<Q> queue ;

    public LinkedList<Q> getQueue() {
        return queue;
    }

    public void setQueue(LinkedList<Q> queue) {
        this.queue = queue;
    }

    public Queue(){
        queue = new LinkedList<Q>();
    }

    public boolean add(Q a){
        return queue.add(a);
    }

    public Q poll(){
        return queue.poll();
    }

    public Q peek(){
        return queue.peek();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}
