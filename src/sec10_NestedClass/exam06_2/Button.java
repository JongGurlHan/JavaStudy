package sec10_NestedClass.exam06_2;

public class Button {

    OnclickListner listner;

    public void setListner(OnclickListner listner){
        this.listner = listner;
    }

    void click(){
        listner.onClick();
    }

    static interface OnclickListner{
        void onClick();
    }

}
