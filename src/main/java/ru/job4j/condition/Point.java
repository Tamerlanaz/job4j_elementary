package ru.job4j.condition;

import static java.lang.Math.*;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {

        return sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance(1, 1, 2, 2);
        System.out.println("result1 (0, 0) to (2, 0) " + result1);
        double result2 = Point.distance(0, 1, 12, 30);
        System.out.println("result2 (0, 0) to (2, 0) " + result2);
    }
}
