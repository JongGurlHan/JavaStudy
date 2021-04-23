package sec12_Java.langPackages.exam14;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

    public static void main(String[] args) {

        String str = "안녕하세요";

        //인코딩: 문자열을 바이트로 바꾸기
        //os가 기본적으로 쓰는 문자셋으로 문자를 바이트 배열로 변환
        byte[]bytes1 = str.getBytes();
        System.out.println(bytes1.length);//인테리제이는 기본적으로 utf-8dlek.

        //디코딩: 바이트를 문자열로 바꾸기
        String str1 = new String(bytes1); //바이트배열의 전체 배열을 문자열로 바꿈
        System.out.println("bytes -> String: " + str);

        try {
            byte[]bytes2 = str.getBytes("EUC-KR");
            System.out.println(bytes2.length);//인테리제이는 기본적으로 utf-8dlek.
            String str2 = new String(bytes2, "EUC-KR");
            System.out.println(str2);


            byte[]bytes3 = str.getBytes("UTF-8");
            System.out.println(bytes3.length);//인테리제이는 기본적으로 utf-8dlek.
            String str3 = new String(bytes3, "UTF-8");
            System.out.println(str3);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
