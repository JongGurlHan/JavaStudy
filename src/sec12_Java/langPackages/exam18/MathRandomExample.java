package sec12_Java.langPackages.exam18;

public class MathRandomExample {

    public static void main(String[] args) {
        int num  = (int)(Math.random()*10)+1; //1부터 10까지의 랜덤 정수
        System.out.println(num);

        //랜덤 주사위
        int nume2 = (int)(Math.random()*6)+1;
        System.out.println(nume2);

    }
}
