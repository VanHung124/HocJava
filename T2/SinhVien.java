package T2;

public class SinhVien {
    private String maSV,ten;
    private int namsinh,diem;

    public SinhVien(String maSV, String ten, int namsinh, int diem) {
        this.maSV = maSV;
        this.ten = ten;
        this.namsinh = namsinh;
        this.diem = diem;
    }


    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV='" + maSV + '\'' +
                ", ten='" + ten + '\'' +
                ", namsinh=" + namsinh +
                ", diem=" + diem +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new SinhVien("a34724","hung",2021,10));

    }
}
