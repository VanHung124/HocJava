package T3.B4;

public class NhanVienFullTime extends NhanVien {

    private int ngayLV;

    public NhanVienFullTime(String tenNV, int luong) {
        super(tenNV, luong);
        this.ngayLV = ngayLV;
    }

    public double tinhLuong(){
        return this.ngayLV*500000;
    }

}
