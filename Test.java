public class Test {
    public static void main(String[] args){
        for (int i=0;i<10;i++){
            System.out.println(P(i));
        }

    }
    public static int P(int n) {
        int a=0;
        int b=1;
        int c=1;

        if(n<0){
            return -1;
        }
        else if (n==0 || n==1){
            return n;
        }
        else {
            for (int i=2;i<n;i++){
                a=b;
                b=c;
                c=a+b;
            }
        }
    return c;
    }



}
