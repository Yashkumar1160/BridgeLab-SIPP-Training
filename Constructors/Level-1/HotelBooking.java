public class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    HotelBooking(){
        guestName="abcd";
        roomType="egfg";
        nights=3;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    HotelBooking(HotelBooking hotel){
        this.guestName=hotel.guestName;
        this.roomType=hotel.roomType;
        this.nights=hotel.nights;
    }
    public static void main(String[] args) {
        HotelBooking Book_1=new HotelBooking();
        HotelBooking Book_2=new HotelBooking("henry","single",4);
        HotelBooking Book_3=new HotelBooking(Book_2);
    }
}
