package sec02_Constructor;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("james", "911210-1111111");
        Korean k2 = new Korean("jake", "0-1111111");
        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);
    }
}

