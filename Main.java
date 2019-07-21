package Home_Work;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Derek"), new Cat("Offset"), new Robot("C3PIO")};
        Obstacle[] course = {new Cross(9000), new Wall(2), new Wall(1), new Cross(120)};
        for (Competitor c : competitors) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        for (Competitor c : competitors) {
            c.info();
        }
    }
}
