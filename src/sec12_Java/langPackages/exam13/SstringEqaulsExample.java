package sec12_Java.langPackages.exam13;

public class SstringEqaulsExample {

    public static void main(String[] args) {

        String strVar1 = new String("한종걸");
        String strVar2 = "한종걸";

        if(strVar1 == strVar2){ //각 변수가 참조하고 있는 번지가 같은지?
            System.out.println("같은 String 객체를 참조");
        }else{
            System.out.println("다른 String 객체를 참조");
        }

        if(strVar1.equals(strVar2)){ //각 객체 내부의 문자열이 같은지?
            System.out.println("같은 문자열을 가짐");
        }else{
            System.out.println("다른 문자열을 가짐");
        }
        //비록 객체는 다르지만 내부의 문자열이 같으므로 true

    }
}
