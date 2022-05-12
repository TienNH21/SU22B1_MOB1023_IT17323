package buoi1_review_oop;

public class MainClass {
    public static void main(String[] args) {
        /*
         * Khi lớp con kế thừa từ lớp cha,
         * đối tượng của lớp con được phép
         * có kiểu dữ liệu của lớp cha
         */
        Nguoi nv = new NhanVien(
            "0123123123", "Ng Van A", 30, "PH1");
        
        System.out.println(
            ((NhanVien) nv).getMaNv()
        );
        System.out.println(nv.xuatThongTin());
    }
}
