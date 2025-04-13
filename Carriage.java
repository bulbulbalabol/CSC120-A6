public interface Carriage {
    int getCapacity();
    int seatsRemaining();
    boolean addPassenger(Passenger p);
    boolean removePassenger(Passenger p);
    void printManifest();
}
