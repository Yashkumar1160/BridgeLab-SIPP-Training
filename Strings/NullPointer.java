public class NullPointer{
    public static void main(String args[]){
        handle();
    }
    public static void handle(){
        String text=null;
        try {
            System.out.println(text.length());
        } catch ( NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
    public static void generate(){
        String text=null;
        System.out.println(text.length());
    }
}