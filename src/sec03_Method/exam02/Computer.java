package sec03_Method.exam02;

public class Computer {

    //Method
    int sum1(int[] values){
        int sum = 0;
        for(int i = 0; i< values.length; i++){
            sum += values[i];
        }
        return sum;
    }

    //배열 객체 만들지 않고 값을 매개변수로 넣는 방법
    int sum2(int ... values){
        int sum = 0;
        for(int i = 0; i< values.length; i++){
            sum += values[i];
        }
        return sum;
    }

    int mul1(int ... values){
        int sum = 1;
        for(int i = 0; i< values.length; i++){
            sum *= values[i     ];
        }
        return sum;
    }

}
