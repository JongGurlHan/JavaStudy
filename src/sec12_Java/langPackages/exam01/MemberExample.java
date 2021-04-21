package sec12_Java.langPackages.exam01;

public class MemberExample {
    public static void main(String[] args) {

        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        if(obj1.equals(obj2)){ //재정의된 equals 호출
            System.out.println("obj1과 obj2는 동등합니다.");
        }else{
            System.out.println("obj1과 obj2는 동등하지 않습니다.");
        }
        if (obj1.equals(obj3)) { //재정의된 equals 호출
            System.out.println("obj1과 obj2는 동등합니다.");
        } else {
            System.out.println("obj1과 obj2는 동등하지 않습니다.");
        }


        System.out.println(obj1 == obj2); // 각 개체가 참조하는 위치가 같은지
    }
}
