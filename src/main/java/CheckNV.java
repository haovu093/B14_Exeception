import java.util.Scanner;

public class CheckNV {

    void checkMNV() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int n;
        System.out.println("Nhập số phần tử của mảng: ");
        n = sc.nextInt();
        String[] arr = new String[n];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Nhập mã nv thứ: " + i);
                arr[i] = sc1.nextLine();
                if (arr[i].matches("NV\\d{7}"))
                    System.out.println("Mã hợp lệ");
                else
                    System.out.println("Mã không hợp lệ");
            }

    }
}
