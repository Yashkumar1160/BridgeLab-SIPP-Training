import java.util.*;
public class Sum_until_zero_or_negative{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double totalSum=0.0;
		double user_inp=sc.nextInt();
		while(true){
			if(user_inp==0||user_inp<0)break;
			totalSum=totalSum+user_inp;
			user_inp=sc.nextInt();		
		}
		System.out.println(totalSum);
		
	}
}