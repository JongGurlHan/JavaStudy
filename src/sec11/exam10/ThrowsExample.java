package sec11.exam10;

public class ThrowsExample {
    public static void main(String[] args) {

        try {
            findClass();
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); //발생된 예외의 내용을 추적해서 print해준다, 개발할대 디버깅 목적으로 보통 한다.
            System.out.println("클래스가 존재하지 않습니다.");
        }

    }
    //findClass()를 호출한 곳으로 던진다.
    //findClass()를 호출한 곳에서 다양하게 예외처리를 하기 위해서
    public static void findClass() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.Stirng2");
    }
}

