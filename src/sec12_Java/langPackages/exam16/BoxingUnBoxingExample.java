package sec12_Java.langPackages.exam16;

public class BoxingUnBoxingExample {

    //Wrapper 클래스
    //기본 타입의 값을 내부에 두고 포장
    //포장하고 있는 기본타입 값은 외부에서 변경할 수 없음음
   public static void main(String[] args) {
        //100이라는 기본 타입 값을 포장(Boxing)해서 Integer 객체로 만듬
        Integer obj1 = new Integer(100);
        Integer obj2 = new Integer("200");

        //생성자 이용하지 않고 각 포장 클래스마다 가진 정적 valueOf()메소드 활용
        Integer obj3 = Integer.valueOf("300");

        int value1 = obj1.intValue();
        int value2 = obj2.intValue();
        int value3 = obj3.intValue();

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }



}
