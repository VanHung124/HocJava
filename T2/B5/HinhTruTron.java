package T2.B5;

public class HinhTruTron extends HinhTron {

    private double chieucao;



    public HinhTruTron(double banKinh, double chieucao) {
        super(banKinh);
        this.chieucao = chieucao;
    }


    public double theTich(){
        return this.chieucao*super.dienTich();
    }

    public static void main(String[] args) {
        HinhTron ht = new HinhTron(4);
        System.out.println(ht.dienTich());
        HinhTruTron htt = new HinhTruTron(3,4);
        System.out.println(htt.theTich());
    }

}
