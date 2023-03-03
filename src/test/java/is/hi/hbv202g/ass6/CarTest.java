package is.hi.hbv202g.ass6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    private Car car=new Car("Beetle");
    @Test
    public void getNameOfCar() {
        assertEquals("Beetle", car.getName());
    }

}
