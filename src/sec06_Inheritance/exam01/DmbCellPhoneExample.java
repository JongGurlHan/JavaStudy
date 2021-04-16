package sec06_Inheritance.exam01;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

        System.out.println("모델: "+ dmbCellPhone.model);
        System.out.println("색상: "+ dmbCellPhone.color);
        System.out.println("채널: "+ dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.powerOff();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요 한종걸입니다.");
        dmbCellPhone.hangUp();
        
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();

    }
}
