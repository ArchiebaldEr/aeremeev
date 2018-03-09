package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FitTest {
    final double manHeight = 180;
    final double womanHeight = 170;
    @Test
    public void manWeight() {
        Fit fit = new Fit();
        double weight = fit.manWeight(manHeight);
        assertThat(weight, is(92D));
    }

    @Test
    public void womanWeight() {
        Fit fit = new Fit();
        double weight = fit.womanWeight(womanHeight);
        assertThat(weight, is(69D));
    }
}