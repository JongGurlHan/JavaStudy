package sec06_Inheritance.exam01;

public class DmbCellPhone extends CellPhone {
    //필드
    int channel;

    //생성자
    DmbCellPhone(String model, String color, int channel){
        super(); // 가 생락돼 있다.컴파일러는 자식클래스를 컴파일할때 기본적으로 이 코드를 넣어준다.
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    //메소드
    void turnOnDmb(){
        System.out.println("채널" +channel+ "번 방송수신을 시작합니다.");
    }
    void changeChannelDmb(int channel){
        this.channel = channel;
        System.out.println("채널" + channel + "번으로 바꿉니다.");
    }
    void turnOffDmb(){
        System.out.println("DMB 방송 수신을 멈춥니다.");
    }
}
