package sec12_Java.langPackages.exam03;

public class Member {
    public String id;

    public Member(String id){
        this.id = id;
    }

    //equals() 매소드를 재정의하는 경우,
    /*
    - 두 객체가 필드값이 같은 동등 객체인지 비교하기 위해
    - 가르키는 주소가 아니라, 안의 필드(데이터)가 같은지 비교하기 위하이다.
    - 두 객체의 필드가 모두 같으면 true를, 그렇지 않으면 false 리턴
    - equals()메소드는 매개값이 기준 객체와 동일 타입 객체인지 먼저 확인 필요!
    */
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member){
            Member member = (Member)obj;
            if(id.equals(member.id)){ //동등한 객체라면
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        //String은 문자열이 같으면 동일한 해시코드가 나오도록 hashCode()가 재정의돼있다.
        return id.hashCode();
    }
}
//https://blog.naver.com/travelmaps/220931531769
