package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP1K1Square0Dot0625() {
        double expected = 0.0625;
        int p = 1;
        double k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenP15K15Square3Dot29() {
        double expected = 3.29;
        int p = 15;
        double k = 15;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}