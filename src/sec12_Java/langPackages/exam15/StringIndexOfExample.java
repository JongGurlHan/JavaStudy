package sec12_Java.langPackages.exam15;

public class StringIndexOfExample  {

    public static void main(String[] args) {
        String subject ="배고프다 저녁머먹지?";

        int location = subject.indexOf("저녁머먹지?");
        System.out.println(location);


        if(subject.indexOf("배고프다") !=-1){ //"배고프다" 가 있다면
            System.out.println("배고프시군요");
       }else{
            System.out.println("배고프지 않군요");
        }
        if(subject.contains("배고프다")){ //"배고프다" 가 존재한다면
            System.out.println("배고프시군요");
        }else{
            System.out.println("배고프지 않군요");
        }



    }
}
