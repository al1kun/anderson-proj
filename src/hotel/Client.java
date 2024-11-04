package hotel;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private int clientId;
    private String name;
    private List<Integer> bookedApartments;

    public Client(int clientId, String name) {
        this.clientId = clientId;
        this.name = name;
        this.bookedApartments = new ArrayList<>();
    }

    public int getClientId() { return clientId; }
    public String getName() { return name; }
    public List<Integer> getBookedApartments() { return bookedApartments; }

    public void addBookedApartment(int apartmentId) {
        bookedApartments.add(apartmentId);
    }
}

