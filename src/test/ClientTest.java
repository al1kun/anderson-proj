package test;

import hotel.Client;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {
    @Test
    public void addBookedApartment() {
        Client client = new Client(1, "John Doe");
        client.addBookedApartment(101);
        assertTrue(client.getBookedApartments().contains(101));
    }
}
