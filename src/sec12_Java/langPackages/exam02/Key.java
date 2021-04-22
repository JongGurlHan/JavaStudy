package sec12_Java.langPackages.exam02;

public class Key {
    public int number;

    public Key(int number){
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Key){ //obj가 Key객체라면
            Key compareKey = (Key)obj; //obj를 Key타입으로 변환
            if(this.number == compareKey.number){
                return true;
            }
        }        return false;
    }
//    hashCode
//    객체를 식별하는 정수값
//    Object클래스의ㅡ 객체 해시코드 메소드는 객체 메모리 번지를 이용해서 만듬 => 객체마다 다른 값
//    hashCode를 재정의하는 경우: 두 객체가 동등한지 비교할때 필요
//     객체가 다를경우 두 객체를 논리적으로 동등하게 만들기 위해선 equals메소드 뿐만 아니라,
// hasCode()를 재정의 해서 똑같이 만들어준다.
    @Override
    public int hashCode() {
        return number;
    }
}
