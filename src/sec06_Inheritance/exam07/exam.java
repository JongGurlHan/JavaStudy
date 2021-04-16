package sec06_Inheritance.exam07;

public class exam {
    public static void main(String[] args) {

        SuperSonicAirplane sa = new SuperSonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flymode = SuperSonicAirplane.NORMAL;
        sa.fly();
        sa.takeOff();


    }
}
