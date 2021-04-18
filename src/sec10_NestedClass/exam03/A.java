package sec10_NestedClass.exam03;

public class A {
    int field1;
    void method1(){};

    static int field2;
    static void method2(){};

    class B{
        //A객체를 생성하고 B객체를 생성해야 호출할 수 있는 메소드다.
        void  method2(){
            field1 = 10;
            method1();
            field2 = 20;
            method2();
        }
    }

    static class C{
        void method(){
//            field1 = 10;
//            method1();
            // C객체는 A없어도 만들수 있는데, A객체가 있어야 하는 두 코드는 여기에 올 수 없다.
            field2 = 20;
            method2();

        }
    }

}
