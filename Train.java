import java.util.ArrayList;

public class Train implements Locomotive {
    private Engine engine;
    private ArrayList<Car> cars;

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        this.engine = new Engine(fuelType, fuelCapacity);
        this.cars = new ArrayList<>();
        for (int i = 0; i < nCars; i++) {
            cars.add(new Car(passengerCapacity));
        }
    }

    public Engine getEngine() {
        return engine;
    }

    public Car getCar(int i) {
        if (i >= 0 && i < cars.size()) {
            return cars.get(i);
        }
        return null;
    }

    public int getMaxCapacity() {
        int sum = 0;
        for (Car c : cars) {
            sum += c.getCapacity();
        }
        return sum;
    }

    public int seatsRemaining() {
        int remaining = 0;
        for (Car c : cars) {
            remaining += c.seatsRemaining();
        }
        return remaining;
    }

    public void printManifest() {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car " + i + " manifest:");
            cars.get(i).printManifest();
        }
    }
}
