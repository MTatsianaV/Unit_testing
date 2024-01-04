package seminars.second.hw;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class VehicleTest {
    @Test
    public void testInstanceOf() {
        Vehicle car = new Car("Company", "Model", 2021);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarNumWheels() {
        Vehicle car = new Car("Company", "Model", 2021);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testMotorcycleNumWheels() {
        Vehicle motorcycle = new Motorcycle("Company", "Model", 2021);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testCarTestDriveSpeed() {
        Vehicle car = new Car("Company", "Model", 2021);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void testMotorcycleTestDriveSpeed() {
        Vehicle motorcycle = new Motorcycle("Company", "Model", 2021);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testCarParkSpeed() {
        Vehicle car = new Car("Company", "Model", 2021);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testMotorcycleParkSpeed() {
        Vehicle motorcycle = new Motorcycle("Company", "Model", 2021);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }

}