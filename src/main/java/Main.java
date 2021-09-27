import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Tiger;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[5];
        animals[0] = new Cat("Барсик");
        animals[1] = new Dog("Бобик");
        animals[2] = new Tiger("Мурзик");
        animals[3] = new Cat("Васька");
        animals[4] = new Dog("Рекс");

        System.out.println(animals[0].run(100) + ". " + animals[0].swim(5));
        System.out.println(animals[1].run(300) + ". " + animals[1].swim(10));
        System.out.println(animals[2].run(500) + ". " + animals[2].swim(16));
        System.out.println(animals[3].run(200) + ". " + animals[3].swim(3));
        System.out.println(animals[4].run(250) + ". " + animals[4].swim(7));

        int catCounter = 0;
        int dogCounter = 0;
        int tigerCounter = 0;

        for(int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            if(animal instanceof Cat) {
                catCounter ++;
            }
            if(animal instanceof Dog) {
                dogCounter ++;
            }
            if(animal instanceof Tiger) {
                tigerCounter ++;
            }
        }

        System.out.println("Всего животных: " + animals.length);
        System.out.println("Котов: " + catCounter);
        System.out.println("Собак: " + dogCounter);
        System.out.println("Тигров: " + tigerCounter);
    }
}
