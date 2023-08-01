public class SoPhuc {
    private double a, b;

    public SoPhuc(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public SoPhuc cong(SoPhuc sp){
        return new SoPhuc(this.a+sp.a,this.b+sp.b);
    }
    public SoPhuc tru(SoPhuc sp){
        return new SoPhuc(this.a-sp.a,this.b-sp.b);
    }
    public SoPhuc nhan(SoPhuc sp){
        return new SoPhuc(((this.a*sp.a)+(this.b*sp.b)),((this.a * sp.b)+(sp.a * this.b)));
    }
    public SoPhuc chia(SoPhuc sp){
//        double a = (this.a * sp.a + this.b * sp.b) / (sp.a * sp.a + sp.b * sp.b);
//        double b = ((sp.a * this.b - this.a * sp.b) / (sp.a * sp.a + sp.b * sp.b));
//        return new SoPhuc(a, b);
        return new SoPhuc((this.a*sp.a+this.b*sp.b)/(sp.a * sp.a + sp.b * sp.b),(this.a*sp.b-sp.a*this.b)/(sp.a * sp.a + sp.b * sp.b));
    }

    @Override
    public String toString() {
        return a +"+"+ b+"i";
    }

    public static void main(String[] args) {
        SoPhuc tinh = new SoPhuc(6,9);
        System.out.println(tinh.cong(new SoPhuc(4,5)));
        System.out.println(tinh.tru(new SoPhuc(4,5)));
        System.out.println(tinh.nhan(new SoPhuc(4,5)));
        System.out.println(tinh.chia(new SoPhuc(1,2)));
    }
}
