package sec12_Java.langPackages.exam08;

public class ClassExample {
    public static void main(String[] args) throws ClassNotFoundException {

        Class clazz = Car.class;

        //Car클래스의 class객체가 생성돼어 그 번지가 clazz2에 저장
        Class clazz2 = Class.forName("sec12_Java.langPackages.exam08.Car");

        //getClass()메소드는 Car클래스의 클래스 객체 번지를 return
        Car car = new Car();
        Class clazz3 = car.getClass();

        //3개모두 가르치는 번지가 같다.
        System.out.println(clazz == clazz2);
        System.out.println(clazz == clazz3);

        //클래스의 전체 이름 구하기
        System.out.println(clazz.getName());
        //클래스의 이름(패키지 제외) 구하기
        System.out.println(clazz.getSimpleName());
        //클래스의 패키지의 이름  구하기
        System.out.println(clazz.getPackage().getName() );
        System.out.println(clazz.getConstructors());
    }
}
