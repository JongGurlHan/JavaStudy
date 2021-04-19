package sec10_NestedClass.exma08;

public class AnonymousExample {
    public static void main(String[] args) {

        Anonymous anony = new Anonymous();
        anony.field.turnOn();
        anony.field.turnOff();

        anony.method1();
        
        //매개변수에 익명 구현객체 대입
        anony.method2(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("끕니다.");

            }
        });




    }
}
