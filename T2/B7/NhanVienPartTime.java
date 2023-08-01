package T2.B7;

import java.util.Random;

public class NhanVienPartTime extends NhanVien {

    private int gioLamViec;

    public NhanVienPartTime(String tenNV, int gioLamViec) {
        super(tenNV);
        this.gioLamViec = gioLamViec;
    }

    public double tinhLuonggio() {
        return this.gioLamViec * 40000;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            NhanVien nv = new NhanVien(" Hung" + i);


            Random generator = new Random();
            int value = generator.nextInt(100) + 1;


            if (value % 2 != 0) {
                int ngayLamViec = generator.nextInt(11) + 15;
                NhanVienFullTime nvft = new NhanVienFullTime(nv.getTenNV(), ngayLamViec);
                System.out.println("nvft" + nvft.getTenNV() + " " + nvft.tinhLuongNgay() + " " + ngayLamViec);
            } else {
                int ngayLamViec = generator.nextInt(121) + 80;
                NhanVienPartTime nvpt = new NhanVienPartTime(nv.getTenNV(), ngayLamViec);
                System.out.println(nvpt.getTenNV() + " " + nvpt.tinhLuonggio() + " " + ngayLamViec);

            }
        }


    }
}
