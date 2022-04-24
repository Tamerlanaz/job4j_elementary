package ru.job4j.math.condition;

public class ThreeMax {

    public static int max(int first, int second, int third) {
        int result = first;
        if (first <= second && second >= third) {
            result = second;
        }
        if (first <= third && second <= third) {
            result = third;
        }
        return result;
    }
}
