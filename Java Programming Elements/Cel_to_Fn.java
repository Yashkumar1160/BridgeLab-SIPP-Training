import java.util.*;
public class Cel_to_Fn{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		float cel=sc.nextFloat();
		float Fn=(cel*9/5)+32;
		System.out.print("The "+cel+" celsius is "+Fn+"fahrenheit");
	}
}