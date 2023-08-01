public class PhanSo {
    private int tu , mau ;

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public PhanSo tong(PhanSo ps){
        return new PhanSo(this.tu * ps.mau + this.mau * ps.tu , this.mau * ps.mau);
    }
    public PhanSo tru (PhanSo ps){
        return new PhanSo(this.tu * ps.mau - this.mau * ps.tu , this.mau * ps.mau);
    }
    public PhanSo nhan (PhanSo ps){
        return new PhanSo(this.tu * ps.tu,this.mau * ps.mau);
    }
    public PhanSo chia (PhanSo ps){
        return this.nhan(new PhanSo(ps.mau, ps.tu));
//        return new PhanSo(this.tu * ps.mau,this.mau * ps.tu);
    }
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);

    }
    public void rutGon(){
        int ucln = USCLN(this.tu, this.mau);
        this.tu /= ucln;
        this.mau = this.mau / ucln;
    }

//    @Override
//    public String toString() {
//        this.rutGon();
//        return this.mau >0 ? (this.tu + (this.mau != 1 ? "/" + this.mau : "")): (this.tu* -1 + (this.mau != 1 ? "/" + this.mau * -1 : ""));
//    }
@Override
    public String toString() {
        this.rutGon();
        String str = mau < 0 ? (-1 * this.tu + "") : (this.tu + "");
        if (this.mau != 1) {
            str += "/" + (this.mau < 0 ? (this.mau * -1 + "") : (this.mau + ""));
        }
        return str;
    }

    public static void main(String[] args) {
        PhanSo tong = new PhanSo(3,4);
        System.out.println(tong.tong(new PhanSo(5,4)));
        System.out.println(tong.tru(new PhanSo(5,4)));
        System.out.println(tong.nhan(new PhanSo(5,4)));
        System.out.println(tong.chia(new PhanSo(5,4)));

    }
}
