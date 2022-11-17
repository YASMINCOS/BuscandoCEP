package sample;


import sample.character.Hunter;
import sample.character.Jedi;
import sample.character.Person;
import sample.character.Sith;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Person> persons = initPersons();

        Person character1 = selectPerson(persons);
        Person character2 = selectPerson(persons);

        while (isPossibleCombat(character1, character2)) {

            attack(character1, character2);

            if (isPossibleCombat(character1, character2)) {
                attack(character2, character1);
            }
        }

        System.out.println("Resultado final:");
        if (character1.currentHp <= 0 && character2.currentHp <= 0) {
            System.out.println("Empate");

        } else if (character1.currentHp > 0) {
            System.out.println(character1.name + " ganhou o combate");

        } else {
            System.out.println(character2.name + " ganhou o combate");
        }
    }

    private static List<Person> initPersons() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Jedi());
        persons.add(new Sith());
        persons.add(new Hunter());

        return persons;
    }

    private static Person selectPerson(List<Person> persons) {
        Person character = persons.get(new Random().nextInt(persons.size()));
        persons.remove(character);

        return character;
    }

    private static boolean isPossibleCombat(Person character1, Person character2) {
        return character1.currentHp > 0 && character2.currentHp > 0;
    }

    private static void attack(Person personAttack, Person personAttacked) {
        int damage = personAttack.attack();

        System.out.println(personAttack.name + " attacked " + personAttacked.name + " with " + damage + " damage");

        personAttacked.currentHp = personAttacked.currentHp - damage;

        System.out.println("");
    }
}
