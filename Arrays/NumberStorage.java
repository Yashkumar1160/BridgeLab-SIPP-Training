
import java.util.Scanner;

public class NumberStorage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double numbers[]=new double[10];
        int idx=0;
        double sum=0;
        while(true){
            if(idx>=10){
                break;
            }
            double number=sc.nextDouble();
            if(number<=0){
                break;
            }
            numbers[idx]=number;
            idx++;
        }
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        }
        System.out.println("The sum of all the numbers is "+sum);
    }
}
