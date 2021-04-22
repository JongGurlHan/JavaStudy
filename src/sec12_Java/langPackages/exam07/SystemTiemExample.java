package sec12_Java.langPackages.exam07;

public class SystemTiemExample {

    public static void main(String[] args) {
        long time1 = System.nanoTime(); //시작 시간

        int sum = 0;
        for(int i = 1; i<=1000000; i++){
            sum += i;
        }
        System.out.println(sum);
        long time2 = System.nanoTime(); //끝 시간

        System.out.println(time2 -time1);

    }
}
