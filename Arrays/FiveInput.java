
import java.util.Scanner;

public class FiveInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numbers[]=new int[5];
        for(int i=0;i<5;i++){
            numbers[i]=sc.nextInt();
            if(numbers[i]>0){
                if(numbers[i]%2==0){
                    System.out.println("Even number");
                }else{
                    System.out.println("Odd number");
                }
            }else if(numbers[i]<0){
                System.out.println("Negative");
            }else{
                System.out.println("Zero");
            }
        }
        int first=numbers[1];
        int last=numbers[numbers.length-1];
        if(first>last){
            System.out.println("First number is greater than last");
        }else if(first<last){
            System.out.println("Last is greater than first");
        }else{
            System.out.println("Both are equal");
        }

    }   
}
