package sample.character;

import java.util.Random;

public class Jedi extends ForceUser {

    public Jedi() {
        this.name = "Jedi";
        this.totalHp = 100;
        this.currentHp = 100;
        this.level = 10;
        this.force = 10;
        this.sabre = 2;
    }

    @Override
    public int attack() {
        if (new Random().nextInt(2) == 0) {
            return forcePower();
        } else {
            return sabreAttack();
        }
    }

    @Override
    int forcePower() {
        print("Usou \"Empurrão com a Força\" ");
        return force;
    }

    @Override
    int sabreAttack() {
        sabreWhon();
        return (level * sabre) + force;
    }
}
