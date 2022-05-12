package buoi2_interface;

public class Vet implements Pet {

    @Override
    public void spa() {
        System.out.println("......");
    }

    @Override
    public void an() {
        System.out.println("Hạt");
    }

    @Override
    public void diChuyen() {
        System.out.println("Bay");
    }

    @Override
    public void tiengKeu() {
        System.out.println("Nhại");
    }
}
