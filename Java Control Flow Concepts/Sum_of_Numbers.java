import java.util.*;
public class Sum_of_Numbers{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double total=0.0;
		double input=sc.nextInt();
		while(input!=0){
			total=total+input;
			input=sc.nextInt();		
		}
		System.out.println(total);
		
	}
}