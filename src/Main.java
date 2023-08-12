
public class Main {
    public static void main(String[] args) {
        Animal shark = new Shark();
        Animal eagle = new Eagle();
        Animal turtle = new Turtle();

        System.out.println(shark.attackMethod());
        System.out.println(eagle.flyMethod());
        System.out.println(turtle.swimMethod());
    }
}