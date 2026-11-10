package llab10;

public class TeamLeader {
    private String name;
    private int patience;
    private UI ui;

    public TeamLeader(String name, int patience, UI ui, Eren e) {
        this.name = name;
        this.patience = patience;
        this.ui = ui;
        e.addLeader(this);
    }

    public void update(int energy) {
        if (patience <= 0)
            return;

        patience -= 5;

        if (patience == 10)
            ui.print(name + ": My patience is waning!");
        else if (patience == 5)
            ui.print(name + ": Is this entertaining?");
        else if (patience == 0)
            ui.print(name + ": Omae wa mou shindeiru");
    }
}
