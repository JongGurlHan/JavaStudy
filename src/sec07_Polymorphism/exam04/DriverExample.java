package sec07_Polymorphism.exam04;

public class DriverExample {

    public static void main(String[] args) {

        Driver driver = new Driver();

        Vehicle vehicle = new Vehicle();

        Bus bus = new Bus();
        Texi texi = new Texi();

        //Bus, Texi모두 Vehicle의 자식클래스,
        //Driver의 drive메소드에서 Vehicle뿐만아니라 Vehicle의
        //자식 객체도 대입될 있다!! Vehicle vehicle = bus;, 자동 타입 변환 발생

        driver.drive(vehicle);
        driver.drive(bus);
    }
}
