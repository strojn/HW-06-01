package pack;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();

        animals.add(0, "кіт");
        animals.add(1, "пес");
        animals.add(2, "лис");
        animals.add(3, "білка");
        animals.add(4, "заець");
        animals.add(5, "слон");
        animals.add(6, "лось");
        animals.add(7, "їжак");

        System.out.println(animals);
    }
}
