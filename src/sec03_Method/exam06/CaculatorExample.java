package sec03_Method.exam06;

public class CaculatorExample {
    public static void main(String[] args) {

        Calculator myCalc = new Calculator();

        double result1 = myCalc.areaRectangle(10);
        double result2 = myCalc.areaRectangle(10 , 20);

        System.out.println(result1);
        System.out.println(result2);

    }
}
