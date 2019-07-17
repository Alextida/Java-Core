package Home_Work;

public class Cat implements Competitor {
            String name;

            int maxRunDistance;
            int maxJumpHeight;

            boolean active;

            @Override
            public boolean isOnDistance() {
                return active;
            }

            public Cat(String name) {
                this.name = name;
                this.maxRunDistance = 10000;
                this.maxJumpHeight = 100;
                this.active = true;
            }

            @Override
            public void run(int dist) {
                if (dist <= maxRunDistance) {
                    System.out.println(name + " хорошо справился с кроссом");
                } else {
                    System.out.println(name + " не справился с кроссом");
                    active = false;
                }
            }

            @Override
            public void jump(int height) {
                if (height <= maxJumpHeight) {
                    System.out.println(name + " удачно перепрыгнул через стену");
                } else {
                    System.out.println(name + " не смог перепрыгнуть стену");
                    active = false;
                }
            }

            @Override
            public void info() {
                System.out.println(name + " - " + active);
            }
        }
