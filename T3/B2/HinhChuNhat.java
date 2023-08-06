package T3.B2;

public class HinhChuNhat implements IHinh {

    private double cd,cr;

    public HinhChuNhat(double cd, double cr) {
        this.cd = cd;
        this.cr = cr;
    }

    @Override
    public double chuVi() {
        return (this.cr*this.cd)/2;
    }

    @Override
    public double dienTich() {
        return this.cd*this.cr;
    }

    @Override
    public void thongTin() {
        System.out.println("chu vi hcn: " + chuVi());
        System.out.println("dien tich hcn: " + dienTich());

    }
}
