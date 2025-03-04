public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    private double LUONG_MAX;

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public boolean tangLuong(double soLuongTang) {
        double luongMoi = tinhLuong() + (luongCoBan * soLuongTang);
        if (luongMoi > LUONG_MAX) {

            return false;
        }
        this.heSoLuong += soLuongTang;
        return true;
    }

    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    public void inTTin() {
        System.out.println("Tên nhân viên: " + tenNhanVien);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Lương thực nhận: " + tinhLuong());
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public static void main(String[] args) {
        NhanVien nv = new NhanVien("Hoang Le", 5000000, 3);
        nv.inTTin();
        System.out.println("Tăng lương: " + nv.tangLuong(2));
        nv.inTTin();
        PhongBan IT1 = new PhongBan("CHL");
        System.out.println(IT1.tongLuong());
    }
}