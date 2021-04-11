package sec04_Instance_StaticMember.exam02;

public class Calculator {

    //static method 선은시 주의할점
    //1. 정적 메소드 선언시 그 내부에 인스턴스 필드 및 메소드 사용 불가
    // ->객체 없어도 사용가능해야 하기 때문에
    //2. 정적 메소드 선언시 그 객체 자신 참조인 this 키워드 사용 불가
    // static 메소드 선언시 this. 인스턴스 필드 및 메소드 사용 불가!!

    //정적 메소드에서 인스턴스 멤버 사용하려는 경우
    // -> 객체 우선 생성 후 참조 변수로 접근

    //Field
    static double pi = 3.14159;

    //Method
    static int plus(int x, int y){
        return x + y;
    }

    static int minus(int x, int y){
        return x - y;
    }
}
