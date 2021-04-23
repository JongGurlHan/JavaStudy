package sec12_Java.langPackages.exam09;

public class ResourcePathExample {
    public static void main(String[] args) {

        Class clazz = ResourcePathExample.class;


        //ResourcePathExample클래스 기준으로 같은 위치기 때문에 그냥 파일명면 입력
        String photo1Path = clazz.getResource("photo1.jpg").getPath();

        String photo2Path = clazz.getResource("images/photo2.jpg").getPath();

        System.out.println(photo1Path);
        System.out.println(photo2Path);

    }
}
