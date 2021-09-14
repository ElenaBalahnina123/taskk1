package Animals;

import Animals.Animal;

public class Cat extends Animal {
    private  String name;
    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    void run(int length) {
        if (length > 200) {
            System.out.println("Кот не может столько пробежать");
        } else System.out.println("Кот пробежал"  + length);
    }

    @Override
    void swim(int length) {
        System.out.println("Кот не умеет плавать");
    }
}
