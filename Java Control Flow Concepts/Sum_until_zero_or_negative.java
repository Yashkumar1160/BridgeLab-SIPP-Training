import java.util.*;
public class Sum_until_zero_or_negative{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double total=0.0;
		double input=sc.nextInt();
		while(true){
			if(input==0||input<0)break;
			total=total+input;
			input=sc.nextInt();		
		}
		System.out.println(total);
		
	}
}