package de.pfleghar.pittest;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void getFizzBuzz() {
        FizzBuzz fb = new FizzBuzz();

        String one = fb.getFizzBuzz(1);
        Assert.assertEquals("1", one);
        String three = fb.getFizzBuzz(3);
        Assert.assertEquals("Fizz", three);
    }

}