package sec09_Interface.exam05;

public class SmartTelevision implements RemoteControl, Searchable{

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > sec09_Interface.exam04.RemoteControl.MAX_VOLUME){
            this.volume = sec09_Interface.exam04.RemoteControl.MAX_VOLUME;
        }else if(volume < sec09_Interface.exam04.RemoteControl.MIN_VOLUME) {
            this.volume = sec09_Interface.exam04.RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼룸: "+ this.volume);
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");

    }
}
