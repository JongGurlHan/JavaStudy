package sec09_Interface.exam09;

public class VehicleExample {
    public static void main(String[] args) {

        Vehicle vehicle = new Bus();
        //Bus bus = new Bus();

        vehicle.run();


        Bus bus = (Bus) vehicle;


    }
}
