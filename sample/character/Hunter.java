package sample.character;

import java.util.Random;

public class Hunter extends Person {

    public Hunter() {
        this.name = "Hunter";
        this.totalHp = 100;
        this.currentHp = 100;
        this.level = 10;
    }

    @Override
    public int attack() {
        if (new Random().nextInt(2) == 0 && currentHp > 20) {
            print("Usou \"Pistola laser\" ");
            return new Random().nextInt(5) + 5;

        } else {
            print("Usou \"Granada termal\" ");
            int attack = 20;
            currentHp = currentHp - attack;

            return attack;
        }
    }
}
