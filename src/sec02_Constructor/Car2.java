package sec02_Constructor;

public class Car2 {

    //Field
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //Constructor
    Car2(){}

    Car2(String model){
        this.model = model;
    }

    Car2(String model, String color){
        this.model = model;
        this.color = color;
    }
    Car2(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    // This()코드 - 생성자 첫줄에만 허용!!
    // 생성자에서 다른 생성자 호출
    // 필드 초기화 내용을 한 생성자에만 집중 작성하고 나머지 생성자는 초기화 내용 가진 생성자로 호출
    // 생성자 오버로딩 증가 시 중복 코드 발생 분제 해결

}
