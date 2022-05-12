package buoi1_review_oop;

public class NhanVien extends Nguoi {
    private String maNv;

    public NhanVien() {
    }
    
    public NhanVien(String cccd, String ten,
        int tuoi, String maNv) {
        super(cccd, ten, tuoi);
        this.maNv = maNv;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }
    
    @Override
    public String xuatThongTin() {
        return super.xuatThongTin() + " - " +
            this.maNv;
    }
}
