package sec09_Interface.exam08;

public class Taxi implements Vehicle{

    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
