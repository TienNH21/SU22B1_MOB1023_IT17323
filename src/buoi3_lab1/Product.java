package buoi3_lab1;

public class Product {
    private String ten;
    private Double gia;

    public Product() {
    }

    public Product(String ten, Double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public String getTen() {
        return this.ten;
    }

    public Double getGia() {
        return this.gia;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }
    
    public double getImportTax()
    {
        return this.gia * 0.1;
    }
}
