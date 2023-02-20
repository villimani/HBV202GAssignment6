package is.hi.hbv202g.ass6;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("Beetle");
        CarManager carManager=new CarManager("John Doe", car);
        System.out.println("Name of car manager: "+carManager.getName());
        System.out.println("Name of managed car: "+carManager.getNameOfCar());
    }
}
