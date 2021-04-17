package sec09_Interface.exam04;

public class RemoteControlExample {
    public static void main(String[] args) {

        RemoteControl rc;
        rc = new Televivsion();

        Televivsion tv = new Televivsion();
        tv.turnOn();
        tv.turnOff();

        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
    }
}
