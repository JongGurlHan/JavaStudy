package sec10_NestedClass.exam10;

public class Anonymous {

    private int field;

    //메소드의 매개변수나 로컬변수를 익명 객체 내부에서 사용할 때의 제한
    //컴파일시 익명 객체에서 사용하는 매개변수나 로컬변수는 final의 특성을 가짐
    public void method(int arg1, int arg2){
        //로컬 변수
        int var1 = 0;
        int var2 = 0;
        
        field =10; //필드값은 상관없음

       // arg1= 10;
       // var2 = 10; -> 값 변경불가, 컴파일 오류 발생
        
        //로컬변수 - 익명클레스로 객체만든다음 대입
        Calculatable calc = new Calculatable() {
            @Override
            public int sum() {
                 int result = field + arg1 + arg2 + var1+ var2;
                 return result;
            }
        };
        System.out.println(calc.sum());
    }
}
