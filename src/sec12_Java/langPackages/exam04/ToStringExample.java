package sec12_Java.langPackages.exam04;

import java.util.Date;

public class ToStringExample {
    public static void main(String[] args) {

        Object obj1 = new Object();
        Date obj2 = new Date();

        //Object가 리던하는 toString()은 기본적으로 클래스이름@해시코드 값이 나온다
        System.out.println(obj1.toString());
        //Date 클래스가 toString()재정의한것!
        System.out.println(obj2.toString());

    }
}
