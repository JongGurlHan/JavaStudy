package sec12_Java.langPackages.exam17;

public class ValueCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 300; // 자동 박싱, 300은 객체이다
        Integer obj2 = 300; // 자동 박싱

        System.out.println("==결과: " + (obj1 == obj2));

        //300을 포장하고 있는 포장 객체의 주소를 참조하고 있기 때문에 false

        //byte,short,int경우 -128 ~127 까지에서 박싱이 되었다면
        //박싱된 객체를 공유해서 사용한다.
        //여기에선 10이라는 값을 박싱한 객체를 1개만 만들어서 obj3,ob4가 참조한다.
        Integer obj3 = 10; // 자동 박싱, 300은 객체이다
        Integer obj4 = 10; // 자동 박싱

        System.out.println("==결과: " + (obj3 == obj4));



     /*
     !!!! 그래서 포장 객쳋 내부 값을 비교할댄 == 및 != 연산자 안쓰는게 좋음(범위 문제때문)
     */
        //그래서 .equals()메소드 사용! (Integer가 equals()메소드 재정의함)
        System.out.println("equals 결과: " + (obj1.equals(obj2)));
        System.out.println("equals 결과: " + (obj3.equals(obj4)));

    }
}
