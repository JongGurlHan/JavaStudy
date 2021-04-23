package sec12_Java.langPackages.exam10;

public class ByteToStringExample {

    public static void main(String[] args) {

        //String 생성자: 직접 String 객체를 생성

        //1. 배열 전체를 String 객체로 생성
        //각각의 byte를 문자로 바꿔서 모두다 결합
        byte[] bytes = {72, 101, 108,108,111,32,74,97,118, 97};

        String str1 = new String(bytes);
        System.out.println(str1); //Hello Java

        //배열의 offset 인덱스 위치부터 객체로 생성 legth만큼 String 객체로 생성
        String str2 = new String(bytes, 6, 4); //index 6번부터 4개를 문자로 변환
        System.out.println(str2);
    }

}
