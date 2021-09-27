package Animals;

public class Tiger extends Animal {

    public Tiger(String name){
        this.name = name;
    }
    @Override
    public String run(int distance) {
        if (distance > 800) {
            return "Тигр " + name + " не смог пробежать " + distance + " м";
        }
        else
            return "Тигр " + name + " пробежал " + distance + " м";
    }

    @Override
    public String swim(int distance) {
        if (distance > 15) {
            return "Тигр " + name + " не смог проплыть " + distance+ " м";
        }
        else
            return "Тигр " + name + " проплыл " + distance + " м";
    }
}
