package sec09_Interface.exam06;

public class MyClass {
    //Field
    RemoteControl rc = new Televivsion(); //인터페이스는 필드 타입으로 선언가능

    //메소드, 생성자의 매개변수자리에 인터페이스 타입이 와서 나중에 호출할때 구현객체를 받을 수 있다.
    //Constructor
    MyClass(){}

    MyClass(RemoteControl rc){
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }

    //Method
    void methodA(){
        RemoteControl rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
    }

    void methodB(RemoteControl rc){
        rc.turnOn();
        rc.setVolume(5);
    }

}
