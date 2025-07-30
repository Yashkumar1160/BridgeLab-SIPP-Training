import java.util.*;
abstract  class  warehouseItem{
    String name;
    public warehouseItem(String name){
        this.name=name;
    }
    public abstract String getType();
}
class Electronics extends warehouseItem{
    public Electronics(String name) {
        super(name);
    }
    public String getType(){
        return "Electronics";
    }
}
class Groceries extends warehouseItem{
    public Groceries(String name) {
        super(name);
    }
    public String getType(){
        return "Groceries";
    }
}
class Furnitures extends warehouseItem{
    public Furnitures(String name) {
        super(name);
    }
    public String getType(){
        return "Furnitures";
    }
}
class Storage<T extends warehouseItem>{
    List<T>itemList=new ArrayList<>();
    public void addItem(T item){
        itemList.add(item);
    }
    public List getItems(){
        return itemList;
    }
}
class Smart_Warehouse{
     public static void displayItems(List<? extends warehouseItem> items) {
        for (warehouseItem item : items) {
            System.out.println(item.name);
        }
    }
    public static void main(String[] args) {
        Storage<Electronics> ec = new Storage<>();
        ec.addItem(new Electronics("Laptop"));
        ec.addItem(new Electronics("Smartphone"));

        Storage<Furnitures> fc = new Storage<>();
        fc.addItem(new Furnitures("Chair"));
        fc.addItem(new Furnitures("Table"));

        Storage<Groceries>gc=new Storage<>();
        gc.addItem(new Groceries("POTATO"));
        gc.addItem(new Groceries("TOMATO"));

        System.out.println("Electronics:");
        displayItems(ec.getItems());

        System.out.println("Furniture:");
        displayItems(fc.getItems());
        System.out.println("Groceries:");
        displayItems(gc.getItems());


    }
}