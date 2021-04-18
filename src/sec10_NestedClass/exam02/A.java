package sec10_NestedClass.exam02;

public class A {

    class B{} // 인스턴스 멤버 클래스
    static class C{} //정적 멤버 클래스

    B field1 = new B();
    C field2 = new C();

    void  method1(){
        B var1 = new B();
        C var2 = new C();
    }

    //static B field3 = new B(); -> B는 A객체가 있어야 사용할 수 있다. static으로 선언되면 A객체가 없어도 field3을 사용할 수 있기때문에 에러발생
    static C field4  = new C();

    static void method2(){
        //B var1 = new B(); //method2()는 A객체 없어도 돌아가는데 B는 A객체 있어야 생성되기 때문에 오류발생
        C var2 = new C();
    }
}
