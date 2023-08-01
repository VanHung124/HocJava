package T2.B5;

public class HinhTron {

    private double banKinh;

    public HinhTron(double banKinh) {
        if(banKinh<0){
            this.banKinh=0;
        }
        else {

            this.banKinh = banKinh;
        }
    }



    public double dienTich(){
        return this.banKinh*this.banKinh*3.14 ;

    }


}
