package sec10_NestedClass.exam06_2;

public class ButtonExample {
    public static void main(String[] args) {

        Button btn1 = new Button();
        btn1.setListner(new SendMessageBtn());
        btn1.click();

    }
}
