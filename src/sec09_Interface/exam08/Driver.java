package sec09_Interface.exam08;

public class Driver {

    public void drive(Vehicle vehicle){ //Vehicle 인터페이스를 구현한 모든 객체가 대입될 수 있다.
        vehicle.run(); //구현객체의 run()이 실행됨.

    }

}
