package T2;

public class NganHang {
    private int soDu;
    private  String tenKH,email,DT,soTK;

    public NganHang(String soTK, int soDu, String DT, String tenKH, String email) {
        this.soTK = soTK;
        this.soDu = soDu;
        this.DT = DT;
        this.tenKH = tenKH;
        this.email = email;
    }


    public void GuiTien(int nopTien){
        soDu = soDu+nopTien;
    }
    public void RutTien(int rut){
        if(rut>soDu){
            System.out.println("so tien k du");
        }
        else {
            soDu=soDu-rut;
        }
    }

    @Override
    public String toString() {
        return "NganHang{" +
                "soTK=" + soTK +
                ", soDu=" + soDu +
                ", DT=" + DT +
                ", tenKH='" + tenKH + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public void hienThi(){
        System.out.println( "NganHang{" +
                "soTK=" + soTK +
                ", soDu=" + soDu +
                ", DT=" + DT +
                ", tenKH='" + tenKH + '\'' +
                ", email='" + email + '\'' +
                '}');
    }

    public static void main(String[] args) {

        NganHang nh = new NganHang("00001111",9999999,"09876543","hung","hung@g");
        nh.hienThi();
        nh.GuiTien(1);
        nh.hienThi();
        nh.RutTien(1000000);
        nh.hienThi();



    }
}
