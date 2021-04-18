package sec10_NestedClass.exam06;

public class Button {
    //인터페이스는 객체를 생성할 수 없으니까 필드 선언만 해준다.
    OnClickListener listener;

    //대신 외부로부터 구현 객체를 받을수 있도록 setter메소드 만든다.
    void setListener(OnClickListener listener){
        this.listener = listener;
    }

    void click(){
        //버튼마다 클릭작동이 다르기 때문에 구체적인 실행내용을 넣어선 안된다.
        listener.onClick();
    }

   //버튼 클릭했을때 버튼 실행내용을 갖고 있는 구현객체를 갖기위해서
    static interface OnClickListener{
        void onClick();
    }

    //필드의 다형성!
    //click의 내용을 구체적으로 작성하지 않고,인터페이스 타입으로
    //필드를 선언하고 필드의 onClick()을 호출함으로서
    //외부로 부터 들어오는 객체에 따라 onClick 실행하게함.
}
