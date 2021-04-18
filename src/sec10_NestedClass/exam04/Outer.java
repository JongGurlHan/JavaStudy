package sec10_NestedClass.exam04;

//로컬 클래스의 사용제한
// 매개변수나 로컬변수를 로컬 클래스에서 사용: 매개 변수나 로컬 변수는 final이 자동적으로 된다.
public class Outer {

    public void method1(final int arg){
        final int localVariable = 1; //로컬 변수


        class inner{
            void method(){
                int result = arg + localVariable;
            }
        }
    }
}
