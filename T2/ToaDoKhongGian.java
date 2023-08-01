package T2;

public class ToaDoKhongGian {
    private int x1,y1;

    public ToaDoKhongGian(int x1, int y1) {
        this.x1 = x1;
        this.y1 = y1;
    }
    public double KhoangCach0(){
        return Math.sqrt(x1*x1+y1*y1);
    }

    public double KhoangCach1(int x2){
        return Math.sqrt(((x2-x1)*(x2-x1))+(y1*y1));
    }
    public double KhoangCach01(int y2){
        return Math.sqrt(((y2-y1)*(y2-y1))+(x1*x1));
    }
    public double KhoangCach2(int a,int b){
        return Math.sqrt(((a-x1)*(a-x1))+((b-y1)*(b-y1)));
    }




    public static void main(String[] args) {
        ToaDoKhongGian kc = new ToaDoKhongGian(3,4);
        System.out.println(kc.KhoangCach0());
        System.out.println(kc.KhoangCach1(1));
        System.out.println(kc.KhoangCach2(1,2));
    }
}
