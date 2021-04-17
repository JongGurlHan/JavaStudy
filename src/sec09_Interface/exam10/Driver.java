package sec09_Interface.exam10;

public class Driver {

    public void drive(Vehicle vehicle){ //Vehicle 인터페이스를 구현한 모든 객체가 대입될 수 있다.
        if(vehicle instanceof Bus){
            Bus bus = (Bus)vehicle;
            bus.checkFair();
        }
        vehicle.run();


    }

}
