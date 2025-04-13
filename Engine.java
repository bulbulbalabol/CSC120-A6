public class Engine implements Driver {
    private FuelType fuelType;
    private double maxFuel;
    private double currentFuel;

    public Engine(FuelType fuelType, double maxFuel) {
        this.fuelType = fuelType;
        this.maxFuel = maxFuel;
        this.currentFuel = maxFuel;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public double getCurrentFuel() {
        return currentFuel;
    }

    public double getMaxFuel() {
        return maxFuel;
    }

    public void refuel() {
        currentFuel = maxFuel;
    }

    public boolean go() {
        if (currentFuel > 0) {
            currentFuel--;
            System.out.println("Remaining fuel: " + currentFuel);
            return true;
        }
        return false;
    }
}
