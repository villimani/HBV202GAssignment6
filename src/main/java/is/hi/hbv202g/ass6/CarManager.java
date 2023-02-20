package is.hi.hbv202g.ass6;

public class CarManager {
    String theName;

    Car theManagedCar;


    CarManager(String name, Car managedCar) {
        theName = name;
        theManagedCar = managedCar;
    }

    String getName() {
        return theName;
    }
    
    String getNameOfCar() {
        return theManagedCar.name;
    }

}
