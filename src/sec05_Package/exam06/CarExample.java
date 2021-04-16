package sec05_Package.exam06;

public class CarExample {
    public static void main(String[] args) {

        Car myCar  = new Car();

        myCar.setSpeed(90);
        System.out.println("현재속도: " + myCar.getSpeed());

        if(!myCar.isStop()){ //차가 가고 있다면
            myCar.setStop(true);
        }
        System.out.println("현재속도: "+ myCar.getSpeed());
    }
}
