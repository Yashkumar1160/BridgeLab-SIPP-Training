class Vehicle {
    static int registrationFee = 5000;
    final String registrationNumber;
    String ownerName, vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(int fee) {
        registrationFee = fee;
    }

    void display() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Type: " + vehicleType);
            System.out.println("Reg No: " + registrationNumber);
            System.out.println("Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Suresh", "Car", "MH12AB1234");
        Vehicle v2 = new Vehicle("Meena", "Bike", "MH14CD5678");
        v1.display();
        v2.display();
        updateRegistrationFee(6000);
        v1.display();
    }
}
