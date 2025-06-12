import java.util.*;
public class Feet_To_Yard
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	float feet=sc.nextFloat();
	double yard=feet/3;
	double mile=yard/1760;
	System.out.print("The distance in yards is "+yard+" while the distance in miles is "+mile);
	
    }
}