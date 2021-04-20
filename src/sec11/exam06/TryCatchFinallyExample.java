package sec11.exam06;

public class TryCatchFinallyExample {
    public static void main(String[] args) {

//        String str = null;
//        System.out.println(str.length());
//        //RuntimeException 을 상송받는 NullPointerException이기 때문에 컴파일러는 예외처리 코드를 요구하지 않는다.

        try {
            Class clazz =  Class.forName("java.lang.String2"); //일반예외(unhandled exception)이기 때문에 컴파일러는 예외처리 코드를 요구한다.
            System.out.println("정상 실행");
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }
}
