package T3.B3;

import java.util.LinkedList;

public class Stack<S> {
     private LinkedList<S> stack ;

    public LinkedList<S> getStack() {
        return stack;
    }

    public void setStack(LinkedList<S> stack) {
        this.stack = stack;
    }

    public Stack(){
         stack = new LinkedList<S>();
    }

    public void push(S a){
        stack.push(a);

    }

    public S pop(){
        return stack.pop();
    }

    public S peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
