package sample.character;

public abstract class ForceUser extends Person {

    public int force;
    public int sabre;

    abstract int forcePower();

    abstract int sabreAttack();

    protected void sabreWhon() {
        print("Usou \"Sabre de luz\"");
        print("WHON");
    }
}
