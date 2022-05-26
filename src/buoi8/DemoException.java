package buoi8;

import java.util.Scanner;

public class DemoException {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.printf("Nhập giá trị thứ %d: ", (i+1));
            try {
                a[i] = Integer.parseInt(sc.nextLine());
                System.out.println("Giá trị vừa nhập: " + a[i]);
            } catch (NumberFormatException e) {
                a = null;
                System.out.println("Nhập sai.");
                e.printStackTrace();
            } catch (NullPointerException e) {
                System.out.println("Chưa khởi tạo");
                e.printStackTrace();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Ngoài phạm vi mảng");
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("Kết thúc xử lý phần tử " + (i+1));
            }
        }
        
        System.out.println("Kết thúc chương trình");
    }
}
