import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int multiple[]=new int[10];
        for(int i=0;i<10;i++){
            multiple[i]=number*(i+1);
        }
        for(int i=0;i<multiple.length;i++){
            System.out.println(multiple[i]);
        }
    }
}
