package sec04_Instance_StaticMember.exam01;

public class Car {
    //Field
    String model; //인스턴스 필드, 객체가 있어야 존재하는 필드
    int speed;

    //Constructor
    Car(String model){
        this.model = model;
    }

    //method
    void setSpeed(int speed){
        this.speed = speed;
    }

    void run(){
        for(int i = 10; i<50; i+= 10){
            this.setSpeed(i); // 객체가 갖고있는 setSpeed, 생략가능
            System.out.println(this.model +"가 달랍니다. (시속:"+ this.speed +"km/h)");
        }
    }
}
