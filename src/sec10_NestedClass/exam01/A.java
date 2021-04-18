package sec10_NestedClass.exam01;

public class A {

    A(){
        System.out.println("A 객체가 생성됨.");
    }

    // 멤버클래스: 클래스의 멤버로서 선언되는 중첩 클래스
    //1. 인스턴스 멤버 클래스 - 인스턴스 필드와 메소드만 선언가능하고, 정적 필드와 메소드는 선언할 수 없음
    class B{

        B(){
            System.out.println("B 객체가 생성됨.");
        }
        int field1;
        void method1(){}
        //static int filed2; -> A객체가 있어야 B객체를 만들어 사용할 수 있기 때문에, static 선언 불가
        //static void method2(){}
    }
    //2. 정적 멤버 클래스
    static class C{
        C(){
            System.out.println("C 객체가 생성됨");
        }
        int field1;
        static int field2;
        void method1(){};
        static void method2(){};
    }



    void method(){
        //로컬 클래스: 생성자 또는 메소드에 선언되는 중첩 클래스
        //3. 로컬 클래스 작성, 로컬클래스를 사용하는곳은 선언된 메소드 안이다.
        class D {
            D(){
                System.out.println("D 객체가 생성됨.");
            }
            int field1;
            void method1(){};
            //static field2; ->로컬 클래스 내부에는 정적 필드, 메소드 입력 못한다.
            //static void  method2();
        }

        D d  = new D();
        d.field1 =1;
        d.method1();
    }

}
