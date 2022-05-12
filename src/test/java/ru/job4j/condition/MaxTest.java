package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.math.condition.Max;

import static ru.job4j.math.condition.Max.*;

public class MaxTest {
    @SuppressWarnings("checkstyle:WhitespaceAfter")
    @Test
    public void whenMax1To2Then2() {
        int one = 1;
        int two = 2;
        int result = Max.max(one, two);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To2To3Then5() {
        int one = 5;
        int two = 2;
        int three = 3;
        int result = Max.max(one, two, three);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To3To4Then4() {
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int result = Max.max(one, two, three, four);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }
}