package sec02_Constructor;

public class Korean {
    //Field
    String nation = "Korea";
    String name;
    String ssn;

    //Constructor
    Korean(String name, String ssn){
        this.name = name; //this: 객체 자기자신을 참조
        this.ssn = ssn;

    }

}
