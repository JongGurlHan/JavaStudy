package sec12_Java.langPackages.exam11;

import java.io.IOException;

public class KeyboardToStringExample {

    public static void main(String[] args) throws IOException {

        byte[] bytes = new byte[100];

        System.out.print("입력: ");
        int readByteNo = System.in.read(bytes);
        //System.in.read 키보드에서 키코드값, 바이트를 읽어, 그 수를 bytes에 저장

        String str = new String(bytes, 0, readByteNo-2);
        System.out.println(str);

    }
}
