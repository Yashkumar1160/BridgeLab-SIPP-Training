import java.util.*;
public class Chocolate_Division{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int numberOfchocolates=sc.nextInt();
		int numberOfChildren=sc.nextInt();
		int chocolates=numberOfchocolates/numberOfChildren;
		int remaining=numberOfchocolates%numberOfChildren;
		System.out.println("The number of chocolates each child gets is "+chocolates+" and the number of remaining chocolates is "+remaining);
		
	}
}