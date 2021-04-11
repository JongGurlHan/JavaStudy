package sec04_Instance_StaticMember.exam05;

public class Person {
    final String nation = "Korean";
    final String ssn;
    String name;

    //외부로 받은 값을 가지고 final 필드인 ssn에 값ㅇ르 준다.
    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
