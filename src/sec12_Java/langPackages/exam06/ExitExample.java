package sec12_Java.langPackages.exam06;

public class ExitExample {
    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            System.out.println(i);
            if(i ==5 ){
                System.exit(0); //보통은 0값을 준다
            }
        }
        System.out.println("마무리 코드");
    }


}
