import java.util.*;
public class Sum_until_zero_or_negative{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double totalSum=0.0;
		double input=sc.nextInt();
		while(true){
			if(input==0||input<0)break;
			totalSum=totalSum+input;
			input=sc.nextInt();		
		}
		System.out.println(totalSum);
		
	}
}