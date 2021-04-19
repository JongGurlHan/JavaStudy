package sec10_NestedClass.exam09;

public class Window {
        Button btn1 = new Button();
        Button btn2 = new Button();

        //필드에 익명 객체 대입
        Button.OnclickListener listener = new Button.OnclickListener() {
            @Override
            public void onClick() {
                System.out.println("전화를 겁니다.");
            }
        };

        Window(){
            btn1.setOnclickListener(listener);
            btn2.setOnclickListener(new Button.OnclickListener() {
                @Override
                public void onClick() {
                    System.out.println("메시지를 보냅니다.");
                }
            });
        }
}
