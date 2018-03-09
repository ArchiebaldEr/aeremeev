package ru.job4j.calculator;

/**
 * Корвертор валюты.
 */
public class Converter {

    private int result;
    final int euro = 70;
    final int dollar = 60;

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */

    public int rubleToEuro(int value) {
        this.result = value / euro;
        return this.result;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */

    public int rubleToDollar(int value) {
        this.result = value / dollar;
        return this.result;
    }

    /**
     * Конвертируем Евро в рубли.
     * @param value рубли.
     * @return Евро.
     */

    public int euroToRuble(int value) {
        this.result = value * euro;
        return this.result;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value рубли.
     * @return Доллары
     */

    public int dollarToRuble(int value) {
        this.result = value * dollar;
        return this.result;
    }

}