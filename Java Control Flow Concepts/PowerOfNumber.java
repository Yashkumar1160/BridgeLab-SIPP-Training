import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();

        int result = 1;
        int count = 0;

        while (count < power) {
            result *= number;
            count++;
        }

        System.out.println(result);
    }
}
