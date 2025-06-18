import javax.swing.*;
import java.util.*;

public class Substring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        int start=sc.nextInt();
        int end=sc.nextInt();
        String sub_str="";
        for(int i=start;i<end;i++){
            char ch=str.charAt(i);
            sub_str+=ch;
        }
        System.out.println(str.substring(start,end));
        System.out.println(sub_str);
        System.out.println(Compare(str,sub_str,start,end));

    }
    public  static boolean Compare(String str,String sub_str,int start,int end){
        String sub=str.substring(start,end);
        if(sub.equals(sub_str)){
            return true;
        }else{
            return false;
        }
    }

}
