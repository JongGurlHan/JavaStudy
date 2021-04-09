package sec02_Constructor.exam2;

public class Car {

    String company;
    String model;
    String color;
    int maxSpeed;

    Car(){}

//    Car(String model){
//        this.model = model;
//        this.color = null;
//        this.maxSpeed = 0;
//    }
    Car(String model){
        this(model, null, 0);
    }


    Car(String model, String color){
        this(model, color,  0);
    }

    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }




}
