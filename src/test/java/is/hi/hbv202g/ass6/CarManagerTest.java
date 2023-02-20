package is.hi.hbv202g.ass6;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarManagerTest {

    @Test
    public void getName() {
        Car car=new Car("Beetle");
        CarManager carManager = new CarManager("John Doe", car);
        assertEquals("John Doe", carManager.getName());
    }

}