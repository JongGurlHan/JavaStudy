package sec04_Instance_StaticMember.exam06;

public class Earth {
    //static final 은 상수(불변의값)이기 때문에 대문자로 하는게 관례
    static final double EARTH_RADIUS = 6400;
    //Math.PI도 static final인것을 알 수 있따.
    static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS;
}
