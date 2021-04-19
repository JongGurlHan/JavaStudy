package sec11.exam01;

public class NullPointExceptionExample {

    public static void main(String[] args) {
        //NullPointException: 객체 참조가 없는 상태의 참조변수로 객체 접근 연산자 도트를 사용할 경우
        String data = null;
        System.out.println(data.toString());
    }
}
