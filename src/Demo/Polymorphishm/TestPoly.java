package Demo.Polymorphishm;

public class TestPoly {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        Lion lion = new Lion();
        lion.eat();
        lion.sleep();
    }
}
