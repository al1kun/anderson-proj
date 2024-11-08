package hotel;

import java.util.*;

public class Hotel implements HotelOperations {
    private final Map<Integer, Apartment> apartmentMap;
    private final List<Client> clients;

    public Hotel() {
        this.apartmentMap = new HashMap<>();
        this.clients = new ArrayList<>();
    }

    public Apartment getApartment(int id) {
        return apartmentMap.get(id);
    }

    @Override
    public void registerApartment(int id, double price) {
        if (apartmentMap.containsKey(id)) {
            System.out.println("An apartment with this ID already exists.");
            return;
        }
        Apartment newApartment = new Apartment(id, price);
        apartmentMap.put(id, newApartment);
        System.out.println("Apartment successfully registered.");
    }

    @Override
    public boolean reserveApartment(int id, String clientName) {
        if (apartmentMap.containsKey(id)) {
            Apartment apartment = apartmentMap.get(id);
            if (apartment.getStatus().equals(ApartmentStatus.AVAILABLE)) {
                apartment.setStatus(ApartmentStatus.RESERVED);
                apartment.setClientName(clientName);
                findOrCreateClient(clientName).addBookedApartment(id);
                System.out.println("Apartment successfully reserved.");
                return true;
            } else {
                System.out.println("Apartment is already reserved. Here are some alternatives:");
                suggestAvailableApartments();
            }
        } else {
            System.out.println("Apartment not found.");
        }
        return false;
    }

    @Override
    public boolean releaseReservation(int id) {
        if (apartmentMap.containsKey(id)) {
            Apartment apartment = apartmentMap.get(id);
            if (apartment.getStatus().equals(ApartmentStatus.RESERVED)) {
                apartment.setStatus(ApartmentStatus.AVAILABLE);
                apartment.setClientName(null);
                System.out.println("Reservation successfully released.");
                return true;
            }
        }
        System.out.println("Apartment not found or not reserved.");
        return false;
    }

    @Override
    public void listApartments() {
        List<Apartment> sortedApartments = new ArrayList<>(apartmentMap.values());
        sortedApartments.sort(Comparator.comparingInt(Apartment::getId));
        for (Apartment apartment : sortedApartments) {
            System.out.println(apartment);
        }
    }

    @Override
    public List<Apartment> listAvailableApartments() {
        List<Apartment> availableApartments = new ArrayList<>();
        for (Apartment apartment : apartmentMap.values()) {
            if (apartment.getStatus().equals(ApartmentStatus.AVAILABLE)) {
                availableApartments.add(apartment);
            }
        }
        return availableApartments;
    }


    @Override
    public void suggestAvailableApartments() {
        List<Apartment> availableApartments = new ArrayList<>();
        for (Apartment apartment : apartmentMap.values()) {
            if (apartment.getStatus().equals(ApartmentStatus.AVAILABLE)) {
                availableApartments.add(apartment);
            }
        }
        availableApartments.sort(Comparator.comparingDouble(Apartment::getPrice));
        for (Apartment apartment : availableApartments) {
            System.out.println("ID: " + apartment.getId() + ", Price: " + apartment.getPrice());
        }
    }

    private Client findOrCreateClient(String name) {
        for (Client client : clients) {
            if (client.getName().equals(name)) {
                return client;
            }
        }
        Client newClient = new Client(clients.size() + 1, name);
        clients.add(newClient);
        return newClient;
    }
}


