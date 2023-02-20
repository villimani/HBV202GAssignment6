package is.hi.hbv202g.ass6;

public class CarOwner {
    String theName;

    Car theOwnedCar;


    CarOwner(String name, Car managedCar) {
        theName = name;
        theOwnedCar = managedCar;
    }

    String getName() {
        return theName;
    }
    
    String getNameOfCar() {
        return theOwnedCar.name;
    }

}
