package test;

import hotel.Apartment;
import hotel.ApartmentStatus;
import hotel.Hotel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {
    private Hotel hotel;

    @BeforeEach
    public void setUp() {
        hotel = new Hotel();
    }

    @Test
    public void registerApartment() {
        hotel.registerApartment(1, 100.0);
        assertNotNull(hotel.getApartment(1));
    }

    @Test
    public void reserveApartment() {
        hotel.registerApartment(1, 100.0);
        assertTrue(hotel.reserveApartment(1, "John Doe"));
        assertEquals("John Doe", hotel.getApartment(1).getClientName());
    }

    @Test
    public void releaseReservation() {
        hotel.registerApartment(1, 100.0);
        hotel.reserveApartment(1, "John Doe");
        assertTrue(hotel.releaseReservation(1));
        assertEquals(ApartmentStatus.AVAILABLE, hotel.getApartment(1).getStatus());
    }

    @Test
    public void listAvailableApartments() {
        hotel.registerApartment(1, 100.0);
        hotel.registerApartment(2, 150.0);
        hotel.reserveApartment(1, "John Doe");
        List<Apartment> availableApartments = hotel.listAvailableApartments();
        assertEquals(1, availableApartments.size());
    }

}

