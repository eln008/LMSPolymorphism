
public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        animals[0] = new Shark();
        animals[1] = new Turtle();
        animals[2] = new Eagle();

        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                Shark shark = (Shark) animal;
                shark.attack();
            } else if (animal instanceof Turtle) {
                Turtle turtle = (Turtle) animal;
                turtle.swim();
            } else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.fly();
            }
        }

        Shark[] sharks = new Shark[1];
        Turtle[] turtles = new Turtle[1];
        Eagle[] eagles = new Eagle[1];

        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                sharks[0] = (Shark) animal;
            } else if (animal instanceof Turtle) {
                turtles[0] = (Turtle) animal;
            } else if (animal instanceof Eagle) {
                eagles[0] = (Eagle) animal;
            }
        }

        sharks[0].attack();
        turtles[0].swim();
        eagles[0].fly();
    }
}