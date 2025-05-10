import static org.junit.Assert.*;
import org.junit.Test;

public class TrainTest {

    // ------------------------
    // Engine Tests
    // ------------------------
    @Test
    public void testEngineConstructor() {
        Engine engine = new Engine(FuelType.ELECTRIC, 100);
        assertEquals(FuelType.ELECTRIC, engine.getFuelType());
        assertEquals(100, engine.getFuelLevel());
    }

    @Test
    public void testEngineGo() {
        Engine engine = new Engine(FuelType.DIESEL, 50);
        engine.go();
        assertTrue(engine.getFuelLevel() < 50); // assuming go() reduces fuel
    }

    // ------------------------
    // Car Tests
    // ------------------------
    @Test
    public void testCarAddPassenger() {
        Car car = new Car(2);
        Passenger p = new Passenger("John");
        boolean added = car.addPassenger(p);
        assertTrue(added);
        assertEquals(1, car.getPassengers().size());
    }

    @Test
    public void testCarRemovePassenger() {
        Car car = new Car(2);
        Passenger p = new Passenger("Jane");
        car.addPassenger(p);
        boolean removed = car.removePassenger(p);
        assertTrue(removed);
        assertEquals(0, car.getPassengers().size());
    }

    // ------------------------
    // Passenger Tests
    // ------------------------
    @Test
    public void testPassengerBoardCarWithSpace() {
        Car car = new Car(1);
        Passenger p = new Passenger("Alex");
        boolean boarded = p.boardCar(car);
        assertTrue(boarded);
        assertEquals(1, car.getPassengers().size());
    }

    @Test
    public void testPassengerBoardCarFull() {
        Car car = new Car(1);
        Passenger p1 = new Passenger("Anna");
        Passenger p2 = new Passenger("Bob");
        p1.boardCar(car); // fills the car
        boolean boarded = p2.boardCar(car);
        assertFalse(boarded);
    }

    // ------------------------
    // Train Tests
    // ------------------------
    @Test
    public void testTrainConstructor() {
        Train train = new Train(FuelType.STEAM, 3, 50); // 3 cars
        assertEquals(3, train.getNumCars());
    }

    @Test
    public void testTrainPassengerCount() {
        Train train = new Train(FuelType.STEAM, 2, 50);
        Passenger p1 = new Passenger("Eve");
        Passenger p2 = new Passenger("Tom");
        train.getCar(0).addPassenger(p1);
        train.getCar(1).addPassenger(p2);
        assertEquals(2, train.getPassengerCount());
    }

    @Test
    public void testTrainGetCar() {
        Train train = new Train(FuelType.ELECTRIC, 2, 50);
        Car car = train.getCar(1);
        assertNotNull(car);
    }

    @Test
    public void testTrainPrintManifest() {
        Train train = new Train(FuelType.STEAM, 2, 50);
        Passenger p = new Passenger("Sam");
        train.getCar(0).addPassenger(p);

        // Basic test to ensure printManifest() runs without crashing
        try {
            train.printManifest();
        } catch (Exception e) {
            fail("printManifest() should not throw an exception");
        }
    }
}
