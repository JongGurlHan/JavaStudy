package sec09_Interface.exam08;

public class Bus implements Vehicle{

    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}
