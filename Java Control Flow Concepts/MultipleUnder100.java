import java.util.Scanner;
public class MultipleUnder100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int counter = number - 1;

        while (counter > 1) {
            if (counter < 100 && counter % number == 0) {
                System.out.println(counter);
            }
            counter--;
        }
    }
}