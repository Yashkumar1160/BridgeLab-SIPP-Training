import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0) {
            String Fizz_Buzz[] = new String[num];
            for (int i = 1; i <= num; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    Fizz_Buzz[i - 1] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    Fizz_Buzz[i - 1] = "Fizz";
                } else if (i % 5 == 0) {
                    Fizz_Buzz[i - 1] = "Buzz";
                } else {
                    Fizz_Buzz[i - 1] = "" + i;
                }
            }

            for (int i = 0; i < Fizz_Buzz.length; i++) {
                System.out.println("Position " + (i + 1) + ": " + Fizz_Buzz[i]);
            }
        }
    }
}
