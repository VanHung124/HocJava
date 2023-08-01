package T2.B4;

public class TaiLieu{
    private String tenTL,namXB;
    private TacGia tg;

    public TaiLieu(String tenTL, String namXB, TacGia tg) {
        this.tenTL = tenTL;
        this.namXB = namXB;
        this.tg = tg;
    }


    public void hienThiThongTin(){
        System.out.println(tenTL+" cua "+tg.getTenTG()+" xuat ban nam "+namXB);
    }

    public static void main(String[] args) {
        TaiLieu tl = new TaiLieu("HHHH","2022",new TacGia("Hung","2001"));
        tl.hienThiThongTin();
    }

}
