package buoi2_interface;

public class Cat implements Animal {
    @Override
    public void an()
    {
        System.out.println("Cá, cơm, gà");
    }

    @Override
    public void diChuyen()
    {
        System.out.println("Chạy, Nhảy");
    }

    @Override
    public void tiengKeu()
    {
        System.out.println("Meow");
    }
}
