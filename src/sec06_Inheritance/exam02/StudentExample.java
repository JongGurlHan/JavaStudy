package sec06_Inheritance.exam02;

public class StudentExample {
    public static void main(String[] args) {
        Student newStudent = new Student("홍길동", "1234-123",1);

        System.out.println(newStudent.name);
        System.out.println(newStudent.ssn);
        System.out.println(newStudent.studentNo);
    }


}
