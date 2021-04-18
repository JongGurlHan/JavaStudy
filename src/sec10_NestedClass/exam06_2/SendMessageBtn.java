package sec10_NestedClass.exam06_2;

public class SendMessageBtn implements Button.OnclickListner {

    @Override
    public void onClick() {
        System.out.println("메시지를 보냅니다.");
    }
}
