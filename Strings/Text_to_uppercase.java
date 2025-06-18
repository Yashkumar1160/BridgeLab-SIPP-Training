import java.util.*;

public class Text_to_uppercase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String method_str=input(str);
        String upper_str=str.toUpperCase();
        System.out.println(Compare(method_str,upper_str));
    }
    public static String input(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z'){
                result+=(char)(ch-32);
            }else{
                result+=ch;
            }
        }
        return  result;
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
