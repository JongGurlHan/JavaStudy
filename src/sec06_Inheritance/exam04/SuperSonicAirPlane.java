package sec06_Inheritance.exam04;

public class SuperSonicAirPlane extends AirPlane{
    //어디나 접근할 수 있고, 클래스 멤버, 상수, 인트형
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    @Override
    public void fly() {
        if(flyMode == SUPERSONIC){
            System.out.println("초음속 비행합니다.");
        }else {
            super.fly(); //부모 메소드 호출
        }
    }
}
