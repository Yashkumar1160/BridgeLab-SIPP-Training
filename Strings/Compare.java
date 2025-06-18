import java.util.*;

public class Compare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str_1=sc.next();
        String str_2=sc.next();
        boolean equal=str_1.equals(str_2);
        boolean compare=Compare(str_1,str_2);
        System.out.println(equal&&compare);
    }
    public static boolean Compare(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
