package hotel;

public class Apartment {
    private final int id;
    private final double price;
    private ApartmentStatus status;
    private String clientName;

    public Apartment(int id, double price) {
        this.id = id;
        this.price = price;
        this.status = ApartmentStatus.AVAILABLE;
        this.clientName = null;
    }

    public int getId() {
        return id;
    }
    public double getPrice() {
        return price;
    }
    public ApartmentStatus getStatus() {
        return status;
    }
    public String getClientName() {
        return clientName;
    }

    public void setStatus(ApartmentStatus status) {
        this.status = status;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Price: " + price +
                ", Status: " + status +
                ", Client: " + (clientName != null ? clientName : "N/A");
    }
}

