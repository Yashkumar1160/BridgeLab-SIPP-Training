import java.util.*;

public class Chararray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        char ch_arr[]=str.toCharArray();
        char char_arr[]=char_arr(str);
        System.out.println(Compare(char_arr,ch_arr));

    }
    public  static char[] char_arr(String str){
        char char_arr[]=new char[str.length()];
        for(int i=0;i<str.length();i++){
            char_arr[i]=str.charAt(i);
        }
        return char_arr;
    }
    public static boolean Compare(char char_arr[],char ch_arr[]){
        if(char_arr.length!=ch_arr.length){
            return false;
        }
        for(int i=0;i<char_arr.length;i++){
            if(char_arr[i]!=ch_arr[i]){
                return false;
            }
        }
        return true;
    }
}
