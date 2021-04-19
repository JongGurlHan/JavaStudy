package sec10_NestedClass.exam09;

public class Button {

    //중첩 인터페이스 선언 - Button에서 발생하는 이벤트를 처리하기 위해 구현객체를 만들기 때문에 버튼과 밀접한 인터페이스 선언
    static interface OnclickListener{
        void onClick();
    }

    private OnclickListener listener;

    public  void setOnclickListener(OnclickListener listener){
        this.listener = listener;
    }

    void touch(){
        listener.onClick();
    }
}
