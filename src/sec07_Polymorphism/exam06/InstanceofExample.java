package sec07_Polymorphism.exam06;

public class InstanceofExample {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        Parent parent2 = new Child();

        method1(parent1);
        method1(parent2);
    }

    public static void method1(Parent parent){
        if(parent instanceof Child){
            Child child = (Child)parent;
            System.out.println("자식 객체로 변환됐습니다.");
        }else{
            System.out.println("자식 객체로 변환 안됐습니다.");
        }

    }






}
