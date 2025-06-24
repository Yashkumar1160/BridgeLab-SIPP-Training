package oop;
import java.util.*;
public class Item {
	int itemCode;
	String itemName;
	int price;
	public Item(int itemCode,String itemName,int price) {
		this.itemCode=itemCode;
		this.itemName=itemName;
		this.price=price;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int itemCode=sc.nextInt();
		String itemName=sc.next();
		int price=sc.nextInt();
		System.out.println("Enter quantity :");
		int quantity=sc.nextInt();
		Item it=new Item(itemCode,itemName,price);
		Display(itemCode,itemName,price);
		Cost(price,quantity);
	}
	public static void Display(int itemCode,String itemName,int price) {

		System.out.println("Item Code: "+itemCode);
		System.out.println("Item Name: "+itemName);
		System.out.println("Item Price: "+price);
	}
	public static void Cost(int price,int quantity) {
		System.out.println("Total cost : "+price*quantity);
		
	}

}
