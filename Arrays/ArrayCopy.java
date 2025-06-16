
import java.util.Scanner;

public class ArrayCopy{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int Array_2D[][]=new int[rows][cols];
        for(int i=0;i<Array_2D.length;i++){
            for(int j=0;j<Array_2D[0].length;j++){
                Array_2D[i][j]=sc.nextInt();
            }
        }
        int array[]=new int[rows*cols];
        int idx=0;
        for(int i=0;i<Array_2D.length;i++){
            for(int j=0;j<Array_2D[0].length;j++){
                array[idx]=Array_2D[i][j];
                idx++;
            }
        }
        System.out.println("1D array elements are :");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
