import java.util.*;
public class StringIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        handle(input);
    }
    public static void generate(String input){
        System.out.println(input.charAt(100));
    }
    public static void handle(String input){
        try {
            System.out.println(input.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBound");
        }
    }
}
