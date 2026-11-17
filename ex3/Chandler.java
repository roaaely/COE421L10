package ex3;

import java.util.Random;

public class Chandler {

    private Humor humor = new SarcasmHumor();

    public Chandler() {
        Random random = new Random();

        while (true) {
            try {
                Thread.sleep(3000);

                int choice = random.nextInt(3);

                if (choice == 0) {
                    humor = new SarcasmHumor();
                } else if (choice == 1) {
                    humor = new WitHumor();
                } else {
                    humor = new SelfDeprecationHumor();
                }

                humor.joke();

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
