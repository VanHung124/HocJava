package T3.B5;

import T3.B3.Stack;
import T3.B3.Queue;

import java.util.ArrayList;

public class bai5_6_7_8 {

    public static void bai5(int a) {

        Stack<Integer> stack = new Stack();

        while (a > 0) {
            stack.push(a % 2);
            a /= 2;
        }
        for (int i : stack.getStack()) {
            System.out.print(i);
        }
    }

    public static void bai6(String a) {

        Stack<String> stack = new Stack();

        for (int i = 0; i < a.length(); i++) {
            stack.push(String.valueOf(a.charAt(i)));
        }

        for (String i : stack.getStack()) {
            System.out.println(i);
        }

    }


    public static void bai8(int a) {

        Queue<Integer> queue = new Queue();
        ArrayList<Integer> b=new ArrayList<Integer>();

        while(a>0){
            b.add(a%2);a/=2;
        }
        for(int i= b.size()-1;i>=0;i--){
            queue.add(b.get(i));
        }

        for(int i:queue.getQueue()){
            System.out.print(i);
        }

    }

    public static void main(String[] args) {
        bai5(8);
        System.out.println();
        bai6("hung");
        System.out.println();
        for(int i=1;i<=8;i++){
            bai8(i);
            System.out.println();
        }
    }

}

