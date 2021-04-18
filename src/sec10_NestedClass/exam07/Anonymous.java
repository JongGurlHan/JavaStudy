package sec10_NestedClass.exam07;

public class Anonymous {

    //익명객체사용_1 - 필드에서
    Person field = new Person(){

        void work(){ //자식만이 가진 메소드
            System.out.println("출근합니다.");
        }

        @Override
        void wake() {
            System.out.println("6시에 일어납니다.");
            work();
        }

    };

    //익명객체사용_2 - 로컬 변수에 대입되는 객체로
    void method1(){
        Person localVar = new Person(){
            void walk(){
                System.out.println("산책합니다.");
            }

            @Override
            void wake() {
                System.out.println("7시에 일어납니다.");
                walk();
            }
        };

        localVar.wake();
    }

    //익명객체사용_3 - 메소드에 부모타입이 있을때
    void method2(Person person){
        person.wake();
    }

}
