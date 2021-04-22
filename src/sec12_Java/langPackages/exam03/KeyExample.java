package sec12_Java.langPackages.exam03;

import sec12_Java.langPackages.exam02.Key;

import java.util.HashMap;


public class KeyExample {

            public static void main(String[] args) {

                //hashMap은 equals()만으로 객체를 동등하게 보지 않는다.
                HashMap<Member, String> hashMap = new HashMap<Member, String>();

                hashMap.put(new Member("fall"), "value1");
                hashMap.put(new Member("winter"), "value1");
                hashMap.put(new Member("fall"), "value1");



            }
        }

