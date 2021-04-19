package sec10_NestedClass.exma08;

public class Anonymous {
    // 1. 필드에 익명객체 대입
    RemoteControl field = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");

        }
    };

    // 2. 로컬변수에 익명객체 대입
    void method1(){
        RemoteControl localVar = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("오디오를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("오디오를 끕니다.");
            }
        };
        localVar.turnOn();
        localVar.turnOff();
    };

    void method2(RemoteControl rc){
       rc.turnOn();
       rc.turnOff();

    }

}
