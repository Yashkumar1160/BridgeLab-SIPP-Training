import java.util.*;
public class Athlete_Rounds{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		float side1=sc.nextFloat();
		float side2=sc.nextFloat();
		float side3=sc.nextFloat();
		int kilometer=5*1000;
		float perimeter=side1+side2+side3;
		int rounds=(int)Math.ceil(kilometer/perimeter);
		System.out.print("The total number of rounds the athlete will run is "+rounds+" to complete 5 km");
	}
}