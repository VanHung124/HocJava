package T2.B7;

public class NhanVienFullTime extends NhanVien {
    private int ngayLamViec;

    public NhanVienFullTime(String tenNV, int ngayLamViec) {
        super(tenNV);
        this.ngayLamViec = ngayLamViec;
    }

    public double tinhLuongNgay(){
        return this.ngayLamViec*500000;
    }

}
