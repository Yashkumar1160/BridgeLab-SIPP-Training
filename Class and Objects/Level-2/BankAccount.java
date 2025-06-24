import java.util.*;
public class BankAccount{
    String accountHolder;
    int accountNumber;
    double balance;
    public BankAccount( String accountHolder,int accountNumber,double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    } 
    public  void Deposit(int amount){
        balance=balance+amount;
    }
    public  void Withdraw(int withdraw){
        balance=balance-withdraw;
    }
    public  void Display(){
        System.out.println("Balance is :"+balance);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String accountHolder=sc.next();
        int accountNumber=sc.nextInt();
        double balance=sc.nextDouble();
        BankAccount account=new BankAccount(accountHolder, accountNumber, balance);
        System.out.println("Enter deposit amount");
        int amount=sc.nextInt();
        account.Deposit(amount);
        System.out.println("Enter withdraw amount");
        int withdraw=sc.nextInt();
        account.Withdraw(withdraw);
        account.Display();
    }
   
}