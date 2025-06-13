import java.util.*;
public class Sum_of_Numbers{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double total_sum=0.0;
		double input=sc.nextInt();
		while(input!=0){
			total_sum=total_sum+input;
			input=sc.nextInt();		
		}
		System.out.println(total_sum);
		
	}
}