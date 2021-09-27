package Animals;

public class Dog extends Animal{

    public Dog(String name){
        this.name = name;
    }
    @Override
    public String run(int distance) {
        if (distance > 500) {
            return "Собака " + name + " не смогла пробежать " + distance + " м";
        }
        else
            return "Собака " + name + " пробежала " + distance + " м";
    }

    @Override
    public String swim(int distance) {
        if (distance > 10) {
            return "Собака " + name + " не смогла проплыть " + distance + " м";
        }
        else
            return "Собака " + name + " проплыла " + distance + " м";
    }
}
