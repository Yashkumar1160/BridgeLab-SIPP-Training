import java.util.*;
public class PalindromeChecker{
    String text;
    public PalindromeChecker(String text){
        this.text=text;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        PalindromeChecker check=new PalindromeChecker(text);
        System.out.println(checker(text));
    }
    public static boolean checker(String text){
        int i=0;
        int j=text.length()-1;
        while(i<j){
            if(text.charAt(i)!=text.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

