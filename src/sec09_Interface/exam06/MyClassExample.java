package sec09_Interface.exam06;

public class MyClassExample {
    public static void main(String[] args) {

        System.out.println("1)---------------------------");

        MyClass myClass1 = new MyClass();
        myClass1.rc.turnOn();
        myClass1.rc.setVolume(5);

        System.out.println("2)---------------------------");

        //Audio는 RemoteControl의 구현객체이므로 대입 가능
        MyClass myClass2 = new MyClass(new Audio());

        System.out.println("3)---------------------------");
        MyClass myClass3 = new MyClass();
        myClass3.methodA();

        System.out.println("4)---------------------------");
        MyClass myClass4 = new MyClass();
        myClass4.methodB(new Televivsion());





    }
}
