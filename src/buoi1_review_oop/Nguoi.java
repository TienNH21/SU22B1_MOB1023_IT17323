package buoi1_review_oop;

public class Nguoi {
    private String ten;
    private String cccd;
    private int tuoi;

    public Nguoi() {
    }

    public Nguoi(String ten, String cccd, int tuoi) {
        this.ten = ten;
        this.cccd = cccd;
        this.tuoi = tuoi;
    }
    
    public String xuatThongTin() {
        return this.cccd + " - " +
            this.ten + " - " +
            this.tuoi;
    }

    public String getTen() {
        return ten;
    }

    public String getCccd() {
        return cccd;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}
