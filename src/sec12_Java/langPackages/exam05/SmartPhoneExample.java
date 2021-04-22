package sec12_Java.langPackages.exam05;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("구글", "안드로아드");

        String strObj = myPhone.toString();
        System.out.println(strObj);
        //sec12_Java.langPackages.exam05.SmartPhone@49e4cb85
        //클래스 전체이름@해시코드

        //sout 은 참조변수가 참조하는 객체의 toString()을 호출해서 출력하게 돼있다.
        //따라서 결과값은 같다!
        System.out.println(myPhone);
    }
}
