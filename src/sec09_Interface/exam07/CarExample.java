package sec09_Interface.exam07;

public class CarExample{
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.run();

        myCar.frontLeftTire = new KumhoTire();
        myCar.frontRightTire = new KumhoTire();
        myCar.backLeftTire = new KumhoTire();
        myCar.backRightTire = new KumhoTire();

        myCar.run();
    }
}
