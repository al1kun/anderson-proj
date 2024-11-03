package hotel;

public class Apartment {
    private int id;
    private double price;
    private boolean status;
    private String clientName;

    public Apartment(int id, double price) {
        this.id = id;
        this.price = price;
        this.status = true;
        this.clientName = null;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public boolean getStatus() {
        return status;
    }

    public String getClientName() {
        return clientName;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
