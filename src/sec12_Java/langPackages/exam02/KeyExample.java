package sec12_Java.langPackages.exam02;

import java.util.HashMap;

public class KeyExample {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");

        //해쉬맵의 키-값쌍의 수를 구하기 위해
        System.out.println(hashMap.size());
    }
}
