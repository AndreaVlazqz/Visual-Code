package Java8;

public class StaticDefaultMethods {
    public static void main(String[] args){
        Vehicle ferrari = new Car("Ferrari","100mph");
        System.out.println(ferrari.getBrand());
        System.out.println(ferrari.getSpeed());
        ferrari.horn();

        System.out.println(Vehicle.getHorsePower(1000,200));
        // ferrari.getHorsePower(1000,200);
    }
}
interface Vehicle{
    String getBrand();
    String getSpeed();

    // methods with body
    //introduce new functionality to the classes implementing an interface
    //override them because they belong to a particular object
    default void horn(){
        System.out.println("Make sound");
    }

    //belongs to the interface
    //cannot be overriden
    static int getHorsePower(int rpm, int torque){
        return (rpm * torque)/5252;
    }
}

class Car implements Vehicle{
    private String brand;
    private String speed;
    public Car(String brand, String speed){
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getSpeed() {
        return speed;
    }

    //if you override a default method the object who use it is going to
    //follow the instructions written here
    @Override
    public void horn() {
        System.out.println("fancy sound");
    }
}
