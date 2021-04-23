package sec12_Java.langPackages.exam17;

public class AutoBoxingUnBoxingExample {
    public static void main(String[] args) {

        //자동 박싱, 100이라는 기본값을 Integer라는 객체로 포장해서, 그 객체를 obj에 대입한거다
        Integer obj = 100;
        System.out.println("value: "+ obj.intValue());

        //obj라는 wrapper객체 안에 있는 기본타입의 값이 자동언박싱돼서 기본타입의 값이 저장됌
        int value = obj;
        System.out.println("value: " + value);

        //obj가 wrapper객체일 경우, 자동언박싱돼서 안의 기본값이 나와 연산된다.
        int result = obj + 100;
        System.out.println("result: " + result);
    }
}
