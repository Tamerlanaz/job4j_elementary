package ru.job4j.math.condition;

public class Max {

    public static int max(int one, int two) {
        return one >= two ? one : two;
    }

    public static int max(int one, int two, int three) {
       int tmp = one >= two ? one : two;
       return three >= tmp ? three : tmp;
    }

    public static int max(int one, int two, int three, int four) {
        return four >= max(one, two, three) ? four : max(one, two, three);
    }
}
