package sec04_Instance_StaticMember.exam04;

public class SingletonExample {
    public static void main(String[] args) {
        /*
        Singleton obj1 = new Singleton();
        Singleton obj2 = new Singleton();
        */

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        //getInstance()가 return 하는 객체는 항상 같은 객체다

        // == 은 두 변수의 번지 비교, 같은 객체인지 비교
        if(obj1 == obj2){
            System.out.println("같은 싱글톤 객체입니다.");
        }else {
            System.out.println("다른 싱글톤 객체입니다.");
            
        }
    }
}
