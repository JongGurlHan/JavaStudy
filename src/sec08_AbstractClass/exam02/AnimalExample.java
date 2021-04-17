package sec08_AbstractClass.exam02;

public class AnimalExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();

        Animal animal= null;
        animal = new Dog();
        animal.sound();

        animalSound(new Dog());
        animalSound(new Cat());
    }
    //Animal 자체는 추상 클래스이기 때문에 매개값응로 Animal의 자식 객체만 대입할 수 있다.
    public static void animalSound(Animal animal){
        animal.sound();
    }

}
