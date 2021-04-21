package sec12_Java.langPackages.exam02;

import java.util.HashMap;

public class KeyExample  {
    public static void main(String[] args) {
        HashMap<Key, String>hashMap = new HashMap<Key, String>();
        //해시맵은 key가 동등객체인지 아닌지 판단할때 먼저 해시코드를 검사하고,
        //해시코드가 동일하다면 equals매소드를 통해 true가 나오는지 판별해서
        //동등객체일 경우 key값이 한개만 지정되도록 한다.
        hashMap.put(new Key(1), "value1");
        hashMap.put(new Key(2), "value2");
        hashMap.put(new Key(1), "value3");

        System.out.println(hashMap.size());

    }
}
