package sec08_AbstractClass.exam01;

public class SmartPhone extends Phone{

    //부모 클래스에서 기본생성자는 없고, 매개변수를 갖고있는 생성자만 있다면, 거기에 맞게끔 super()를 작성해야 한다.
    public SmartPhone(String owner) {
        super(owner);
    }

    //메소드
    public void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }



}
