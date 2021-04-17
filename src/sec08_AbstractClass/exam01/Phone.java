package sec08_AbstractClass.exam01;

public abstract class Phone {
    //추상 클래스도 일반 클래스와 마찬가지로 필드, 생성자, 메소드 선언할 수 있음
    //추상 클래스는 new를 통해 객체 생성은 불가능하다
    //직접 객체를 생성할 수 없지만, 자식 객체 생성될때 객체회됨(자식 생성자에서 super(...)형태로 추상 클래스의 생성자 호출

    public String owner;

    //생성자
    public Phone(String owner){
        this.owner = owner;
    }

    //메소드
    public void turnOn(){
        System.out.println("폰 전원을 켭니다.");
    }
    public void turnOff(){
        System.out.println("폰 전원을 끕니다.");
    }
}
