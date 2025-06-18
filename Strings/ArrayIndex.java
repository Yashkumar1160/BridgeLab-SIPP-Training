import java.util.Scanner;
public class ArrayIndex {
    public static void handleException() {
        Scanner sc=new Scanner(System.in);
        String names[]=new String[3];
        for(int i=0;i<3;i++){
            names[i]=sc.nextLine();
        }
        try {
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException ");
        }
    }

    public static void main(String[] args) {
        handleException();
    }
}