package hotel;

public interface HotelOperations {
    void registerApartment(int id, double price);
    boolean reserveApartment(int id, String clientName);
    boolean releaseReservation(int id);
    void listApartments();
    void listAvailableApartments();
    void suggestAvailableApartments();
}

