package T3.B2;

import java.util.ArrayList;

public class HinhTron implements IHinh {

    private double r;

    public double getR() {
        return r;
    }

    public HinhTron(double r) {
        this.r = r;
    }

    @Override
    public double chuVi() {
        return this.r * 2 * 3.14;
    }

    @Override
    public double dienTich() {
        return this.r * this.r * 3.14;
    }

    @Override
    public void thongTin() {
        System.out.println("chu vi ht: " + chuVi());
        System.out.println("dien tich ht: " + dienTich());
    }

    public static void main(String[] args) {

        ArrayList<IHinh> hinh = new ArrayList<IHinh>();

        hinh.add(new HinhTron(3));
        hinh.add(new HinhChuNhat(4, 4));

        for (IHinh i : hinh) {
            i.thongTin();
        }




    }


}
