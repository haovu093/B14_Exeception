import java.util.Random;
import java.util.Scanner;

public class CheckRanDom {
    void sosanhRandom() throws RandomCheckingException {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập số tự nhiên n:");
        try{
        n = sc.nextInt();
            if (n <= 0) throw new RandomCheckingException("Số tự nhiên phải > 0.");
        } catch (Exception e) {
            throw new RandomCheckingException(" n phải là một số.");
        }
        Random random = new Random();
        int min = 10;
        int max = 50;
        int value = random.nextInt((max - min) + 1) + min;
        System.out.println(value);
            if (n == value) {
                System.out.println("Hai số bằng nhau:");
            } else System.out.println("Hai số không bằng nhau");

        }
    }
