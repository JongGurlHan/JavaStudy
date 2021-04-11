package sec04_Instance_StaticMember.exam05;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-123456", "James");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        //p1.nation ="usa";
        //p1.ssn ="123";
        p1.name ="jake";
    }
}
