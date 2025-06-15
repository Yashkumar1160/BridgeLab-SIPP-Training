import java.util.*;
public class Sum {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a Natural Number");
            return;
        }

        int sumLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumLoop += i;
        }

        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using loop: " + sumLoop);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumLoop == sumFormula)
            System.out.println("Both results are equal.");
        else
            System.out.println("Results do not match.");
    }
}
