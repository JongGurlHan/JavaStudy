package sec09_Interface.exam08;

public class DriverExam {
    public static void main(String[] args) {

        Driver driver = new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi);


    }
}
