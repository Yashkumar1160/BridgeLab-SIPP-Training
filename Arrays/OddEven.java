import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0) {
            int odd[] = new int[number / 2 + 1];
            int even[] = new int[number / 2 + 1];
            int odd_idx = 0;
            int even_idx = 0;

            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    even[even_idx] = i;
                    even_idx++;  
                } else {
                    odd[odd_idx] = i;
                    odd_idx++;   
                }
            }

            System.out.println("Even numbers are:");
            for (int i = 0; i < even_idx; i++) {  
                System.out.println(even[i]);
            }

            System.out.println("Odd numbers are:");
            for (int j = 0; j < odd_idx; j++) {   
                System.out.println(odd[j]);
            }
        } else {
            System.out.println("Not a natural number");
        }
    }
}
