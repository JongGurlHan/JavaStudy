package sec05_Package.exam02.mycompany;

import sec05_Package.exam02.hankook.SnowTire;
import sec05_Package.exam02.hyundai.Engine;
import sec05_Package.exam02.kumho.BigWidthTire;

public class Car {

    //Field
    Engine engine = new Engine();
    SnowTire tire1 = new SnowTire();
    BigWidthTire tire2 = new BigWidthTire();

    //서로 다른 패키지의 동일한 이름의 클래스를 가져올땐?
    sec05_Package.exam02.hankook.Tire tire3 = new sec05_Package.exam02.hankook.Tire ();
    sec05_Package.exam02.kumho.Tire tire4 = new sec05_Package.exam02.kumho.Tire ();


}
