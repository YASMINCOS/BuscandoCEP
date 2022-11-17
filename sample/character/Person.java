package sample.character;

public abstract class Person implements Movement {

    public String name;
    public int totalHp;
    public int currentHp;

    public int level;

    public void print(String string) {
        System.out.println(string);
    }
}
