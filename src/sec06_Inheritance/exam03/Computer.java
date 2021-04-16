package sec06_Inheritance.exam03;

public class Computer extends Calculator{

    //메소드 선언부는 부모와 동일해야한다, 단 접근제한자는 더 넓은 범위로 변경 가능!
    @Override // 부모에 똑같은 메소드가 있는지 검사한다. 없다면 컴파일 오류 발생
    public double areaCircle(double r){
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
