package test;

import hotel.Apartment;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ApartmentTest {
    @Test
    public void testSetClientName() {
        Apartment apartment = new Apartment(101, 200.0);
        apartment.setClientName("Jane Doe");
        assertEquals("Jane Doe", apartment.getClientName());
    }
}

