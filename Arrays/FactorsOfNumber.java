import java.util.Scanner;
public class FactorsOfNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxFactor = 10;
        int factors[]=new int[maxFactor];
        int Index=0;
        for (int i = 1; i <=maxFactor; i++) {
            if (maxFactor % i == 0){
                if(Index==maxFactor){
                    maxFactor=maxFactor*2;
                    int temp[]=new int[maxFactor];
                    for(int j=0;j<Index;j++){
                        temp[j]=factors[j];
                    }
                    factors=temp;
                }
                factors[Index++]=i;
            }        
        }
        System.out.println("Factors of number "+maxFactor+" are :");
        for(int i=0;i<factors.length;i++){
            if(factors[i]==0)break;
            System.out.println(factors[i]);
        }

    }
}
