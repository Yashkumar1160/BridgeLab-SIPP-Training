import java.util.*;
public class Divisible_by_Five{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        boolean div=false;
        if(number%5==0){
            div=true;
        }
        System.out.println("Is the number "+number+" divisible by 5 ?"+div);


    }
}