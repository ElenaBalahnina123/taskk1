package Animals;

public class Cat extends Animal {

    public Cat(String name){
        this.name = name;

    }

    @Override
    public String run(int distance) {
            if (distance > 200) {
                return "Кот " + name + " не смог пробежать " + distance + " м";
            }
            else
                return "Кот " + name + " пробежал " + distance + " м";
    }

    @Override
    public String swim(int distance) {

        return "Кот " + name +  " не умеет плавать";
    }
}
