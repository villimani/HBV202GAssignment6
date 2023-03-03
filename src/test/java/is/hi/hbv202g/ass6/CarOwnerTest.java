package is.hi.hbv202g.ass6;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarOwnerTest {


    private CarOwner carOwner = new CarOwner("John Doe");
    @Test
    public void getName() {
        assertEquals("John Doe", carOwner.getName());
    }

}