package T3.B4;

import java.util.ArrayList;
import java.util.Random;

public class NhanVienPartTime extends NhanVien {

    private int gioLV;

    public NhanVienPartTime(String tenNV, int luong) {
        super(tenNV, luong);
        this.gioLV = gioLV;
    }

    public double tinhLuong(){
        return this.gioLV*40000;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            ArrayList<NhanVien> nv = new ArrayList<NhanVien>();
            int a=0;int h=0;int g=0;
            Random generator = new Random();
            int value = generator.nextInt(100) + 1;


            if (value % 2 != 0) {
                int ngayLamViec = generator.nextInt(11) + 15;
                nv.add(new NhanVienFullTime("NhanVienFullTime "+i,ngayLamViec));

            } else {
                int gioLamViec = generator.nextInt(121) + 80;
                nv.add(new NhanVienPartTime("NhanVienPartTime "+i,gioLamViec));

            }
            nv.get(i).tinhLuong();
            System.out.println(nv.get(i).getTenNV()+nv.get(i).getLuong());
            // đang bị lỗi

        }

    }

}
