public class Person {
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Person(Person per_2){
        this.name=per_2.name;
        this.age=per_2.age;
    }
    public static void main(String[] args) {
        Person per_1=new Person("Yash",20);
        Person per_2=new Person(per_1);
    }

}
