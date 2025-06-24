public class MovieTicket{
    String movieName;
    int seatNumber;
    double price;
    public   void bookticket(String movieName,int seatNumber,double price){
        this.movieName=movieName;
        this.seatNumber=seatNumber;
        this.price=price;
        System.out.println("Ticket Booked");
    }
    public  void display(){
        System.out.println(movieName);
        System.out.println(seatNumber);
        System.out.println(price);
    }
    public static void main(String[] args) {
        MovieTicket ticket=new MovieTicket();
        // Scanner sc=new Scanner(System.in);
        ticket.bookticket("Inception",15,342.93);
        ticket.display();
    }
}
