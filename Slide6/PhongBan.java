public class PhongBan {
    private String tenPhongBan;
    private byte soNhanVien;
    private static int soNvMax = 100;
    private NhanVien[] arr;
    
    public PhongBan(String tenPhongBan){
        this.tenPhongBan = tenPhongBan;
        arr = new NhanVien[soNvMax + 1];
        soNhanVien = 0;
    }
    
    public boolean themNhanVien(NhanVien a){
        if(soNhanVien < soNvMax){
            arr[soNhanVien] = a;
            ++soNhanVien;
            return true;
        }
        else{
            return false;
        }
    }
    
    public NhanVien xoaNhanVien(NhanVien a){
        if(soNhanVien > 0){
            NhanVien b = arr[soNhanVien - 1];
            arr[soNhanVien - 1] = null;
            soNhanVien--;
            return b;
        }
        else{
            return null;
        }
    }
    
    public double tongLuong(){
        double sum = 0.0;
        for(int i=0 ; i<soNhanVien ; ++i){
            sum = sum + arr[i].tinhLuong();
        }
        return sum;
    }
    
    public void inTTin(){
        System.out.println(tenPhongBan);
        System.out.println(soNhanVien);
        for(int i=0 ; i<soNhanVien ; ++i){
            arr[i].inTTin();
        }
    }
}