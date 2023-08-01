package T2.B6;

public class HinhLapPhuong extends HinhChuNhat {

    private double chieucao;


    public HinhLapPhuong(double cd, double cr, double chieucao) {
        super(cd, cr);
        this.chieucao = chieucao;
    }


    public double theTichHLP() {
        return this.chieucao * super.dienTichHCN();
    }

    public static void main(String[] args) {
        HinhChuNhat hv = new HinhChuNhat(3,3);
        System.out.println(hv.dienTichHCN());
        HinhLapPhuong hlp = new HinhLapPhuong(3,3,3);
        System.out.println(hlp.theTichHLP());
        HinhChuNhat hcn = new HinhChuNhat(3,4);
        System.out.println(hcn.dienTichHCN());
    }


}
