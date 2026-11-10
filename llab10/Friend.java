package llab10;

import java.util.Random;

public class Friend {
    private String name;
    private UI ui;
    private Random random = new Random();

    public Friend(String name, UI ui, Eren e) {
        this.name = name;
        this.ui = ui;
        e.addFriend(this);
    }

    public void update(int energy) {
        if (random.nextBoolean()) {
            ui.print(name + ": Eren, please be safe!");
        }

        if (energy < 20) {
            ui.print(name + ": Rage, rage against the dying of the light");
        }
    }
}
