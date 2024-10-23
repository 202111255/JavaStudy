abstract class Animal {
    abstract void cry();
}

class Dog extends Animal {
    @Override
    void cry() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("야옹");
    }
}


public class AbstackMainEx03 {
    public static void main(String[] args) {

        Animal animal = new Dog();
        animal.cry();

        animal = new Cat();
        animal.cry();
        
    }
}
