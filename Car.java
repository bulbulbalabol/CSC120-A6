import java.util.ArrayList;

public class Car implements Carriage {
    private ArrayList<Passenger> passengers;
    private int capacity;

    public Car(int capacity) {
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int seatsRemaining() {
        return capacity - passengers.size();
    }

    public boolean addPassenger(Passenger p) {
        if (seatsRemaining() > 0) {
            passengers.add(p);
            return true;
        }
        return false;
    }

    public boolean removePassenger(Passenger p) {
        return passengers.remove(p);
    }

    public void printManifest() {
        if (passengers.isEmpty()) {
            System.out.println("This car is EMPTY.");
        } else {
            for (Passenger p : passengers) {
                System.out.println(p.getName());
            }
        }
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
}
