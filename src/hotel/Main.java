package hotel;

public class Main {
    public static void main(String[] args) {

        HotelOperations hotel = new Hotel();

        hotel.registerApartment(1, 100.0);
        hotel.registerApartment(2, 150.0);
        hotel.registerApartment(3, 200.0);

        hotel.registerApartment(1, 120.0);

        hotel.reserveApartment(1, "John Doe");

        hotel.reserveApartment(1, "Jane Smith");

        hotel.releaseReservation(1);

        hotel.releaseReservation(1);

        System.out.println("\nAll Apartments:");
        hotel.listApartments();

        System.out.println("\nAvailable Apartments:");
        hotel.listAvailableApartments();

        hotel.reserveApartment(4, "Mark Johnson");

        hotel.reserveApartment(2, "Alice Brown");
        hotel.reserveApartment(2, "Bob White");
    }
}

