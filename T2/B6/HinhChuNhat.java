package T2.B6;

public class HinhChuNhat {

    private double cd, cr;

    public HinhChuNhat(double cd, double cr) {

        if (cr < 0 || cd < 0) {
            this.cd = 0;
            this.cr = 0;

        } else {
            this.cd = cd;
            this.cr = cr;
        }
    }

    public double dienTichHCN() {
        return this.cd * this.cr;
    }


}
