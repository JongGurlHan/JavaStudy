package sec05_Package.exam05.package2;

import sec05_Package.exam05.package1.A;

public class C {

    public C(){
        A a = new A();
        a.field = 10;
        a.method();
    }
    public void method(){
        A a = new A();
        a.field = 10;
        a.method();

    }
}
