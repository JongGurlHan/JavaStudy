package sec10_NestedClass.exam07;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();
        anony.field.wake(); //부모 객체 메소드만 사용가능
        anony.method1();

        anony.method2(new Person(){
            void study(){
                System.out.println("공부를 합니다.");
            }

            @Override
            void wake() {
                System.out.println("8시에 일어납니다.");
                study();
            }
        });
    }
}
