package hotel;

import java.util.List;

public interface HotelOperations {
    void registerApartment(int id, double price);
    boolean reserveApartment(int id, String clientName);
    boolean releaseReservation(int id);
    void listApartments();
    void suggestAvailableApartments();
    List<Apartment> listAvailableApartments();
}

