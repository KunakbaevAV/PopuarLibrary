package com.artmil.mygallery;

import com.artmil.mygallery.lesson7.MyMath;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyMathTest {
    private MyMath math;

    @Before
    public void before() {
        math = new MyMath();
    }

    @Test
    public void summ_do_isCorrect() {
        int summ = math.summ(2, 3);
        Assert.assertEquals(summ, 5);
    }

    @Test
    public void summ_do_isIncorrect() {
        int summ = math.summ(2, 3);
        Assert.assertNotEquals(summ, 4);
    }
}
