package llab10;

import java.util.Random;

public class Titan {
    private String name;
    private UI ui;
    private Random random = new Random();

    public Titan(String name, UI ui, Eren e) {
        this.name = name;
        this.ui = ui;
        e.addTitan(this);
    }

    public void update(int energy) {
        if (random.nextBoolean()) {
            ui.print(name + " attacks Eren!");

            if (energy > 40) {
                ui.print(name + ": Now we got problems, and I don't think we can solve 'em");
            }
        }
    }
}
