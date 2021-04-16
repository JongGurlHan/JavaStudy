package sec06_Inheritance.exam06;

public class Car {
    //필드
    public int speed;

    //생성자
    //메소드
    public void speedUp(){
        speed += 1;
    }
    
    public final void stop(){ //Car의 자식클래스는 이 메소드를 재정의하지말라는 뜻
        System.out.println("차를 멈춤");
        speed = 0;
    }
}
