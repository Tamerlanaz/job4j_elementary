package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.math.condition.Point;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to00then0() {
        double expected = 0;
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to00then1dot41() {
        double expected = 1.41;
        Point a = new Point(1, 1);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when84to25then6dot08() {
        double expected = 6.08;
        Point a = new Point(8, 4);
        Point b = new Point(2, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when800to100then7() {
        double expected = 7;
        Point a = new Point(8, 0, 0);
        Point b = new Point(1, 0, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when100to100then0() {
        double expected = 0;
        Point a = new Point(1, 0, 0);
        Point b = new Point(1, 0, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when842to248then8dot48() {
        double expected = 8.48;
        Point a = new Point(8, 4, 2);
        Point b = new Point(2, 4, 8);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}