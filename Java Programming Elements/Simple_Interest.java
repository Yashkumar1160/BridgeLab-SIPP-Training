import java.util.*;
public class Simple_Interest{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int principal=sc.nextInt();
		float rate=sc.nextFloat();
		int time=sc.nextInt();
		double simpleInterest=(principal*rate*time)/100;
		System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
	}
}