package T3.B4;

public class NhanVien {

    private String tenNV;
    private int luong;

    public NhanVien(String tenNV, int luong) {
        this.tenNV = tenNV;
        this.luong = luong;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public NhanVien(String tenNV) {
    }

    public double tinhLuong(){
        return 0;
    }

}


