package llab10;

import java.util.ArrayList;
import java.util.Random;

public class Eren extends Thread {
    private int energy;
    private UI ui;
    private ArrayList<TeamLeader> leaders = new ArrayList<>();
    private ArrayList<Friend> friends = new ArrayList<>();
    private ArrayList<Titan> titans = new ArrayList<>();

    public Eren(int energy, UI ui) {
        this.energy = energy;
        this.ui = ui;
    }

    public void addLeader(TeamLeader leader) {
        leaders.add(leader);
    }

    public void addFriend(Friend friend) {
        friends.add(friend);
    }

    public void addTitan(Titan titan) {
        titans.add(titan);
    }

    public void run() {
        Random random = new Random();

        while (energy > 0) {
            try {
                Thread.sleep((5 + random.nextInt(6)) * 1000);

                energy -= 5;
                ui.print("Eren transformed! Energy: " + energy);

                for (TeamLeader l : leaders)
                    l.update(energy);

                for (Friend f : friends)
                    f.update(energy);

                for (Titan t : titans)
                    t.update(energy);

                Thread.sleep(10000);
                ui.print("Eren returned to normal.");

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }

        ui.print("Eren has no energy left!");
    }
}
