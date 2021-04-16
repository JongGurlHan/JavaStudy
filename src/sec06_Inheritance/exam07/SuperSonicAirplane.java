package sec06_Inheritance.exam07;

public class SuperSonicAirplane extends AirPlane{

    public static final int SUPERSONIC = 1;
    public static final int NORMAL = 2;

    public int flymode = SUPERSONIC;

    @Override
    void fly() {
        if (flymode == 1){
            System.out.println("초음속으로 비행합니다.");
        }else{
            super.fly();
        }
    }
}
