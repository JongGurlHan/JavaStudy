package sec09_Interface.exam06;

public interface RemoteControl {
    //상수
    //public static final int MAX_VOLUME = 10;
    int MAX_VOLUME = 10; //앞에 없어도 상수가 된다.
    int MIN_VOLUME = 10;

    //메소드
    void turnOn(); //앞에 public abstract가 생략돼있다.
    void turnOff();
    void setVolume(int volume);

}