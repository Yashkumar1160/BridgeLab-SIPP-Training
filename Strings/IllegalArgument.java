import java.util.Scanner;
public class IllegalArgument {
    static void generate(String str){
        System.out.println(str.substring(5,2));
    }
    static void handle(String str){
        try{
            System.out.println(str.substring(5,2));
        }catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        handle(input);
    }
}
