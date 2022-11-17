package sample.character;

public class Sith extends ForceUser {

    public Sith() {
        this.name = "Sith";
        this.totalHp = 100;
        this.currentHp = 100;
        this.level = 10;
        this.force = 5;
        this.sabre = 2;
    }

    @Override
    public int attack() {
        if (currentHp <= 20) {
            return forcePower();
        } else {
            return sabreAttack();
        }
    }

    @Override
    int forcePower() {
        print("Usou \"Raio de Força\" ");
        return level * force;
    }

    @Override
    int sabreAttack() {
        sabreWhon();
        return level * sabre;
    }
}
