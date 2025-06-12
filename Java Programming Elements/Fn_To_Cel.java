import java.util.*;
public class Fn_To_Cel{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);	
		float fahrenheit=sc.nextFloat();
		float celsius=(fahrenheit-32)*5/9;
		System.out.print("The "+fahrenheit+" fahrenheit is "+celsius+"celsius");
			
	}
}