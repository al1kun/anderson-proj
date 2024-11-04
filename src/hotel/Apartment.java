package hotel;

public class Apartment {
    private int id;
    private double price;
    private String status;
    private String clientName;

    public Apartment(int id, double price) {
        this.id = id;
        this.price = price;
        this.status = "available";
        this.clientName = null;
    }

    public int getId() { return id; }
    public double getPrice() { return price; }
    public String getStatus() { return status; }
    public String getClientName() { return clientName; }

    public void setStatus(String status) { this.status = status; }
    public void setClientName(String clientName) { this.clientName = clientName; }
}

