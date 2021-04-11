package sec04_Instance_StaticMember.exam04;

//싱글톤: 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 코딩기법
//작성 방법
//1. 클래스 외부에서 new 연산자를 통해 생성자 호출하는것 불가능하도록 private 접근제한자 사용
//2. 자신의 타입인 정적 필드 선언 후 자신의 객체 생성해 초기화
//3. 외부에서 호출할 수 있는 getInstance()선언
public class Singleton {
    //static field
    private static Singleton singleton = new Singleton();

    private Singleton(){    }

    static Singleton getInstance(){
        return singleton;
    }
}
