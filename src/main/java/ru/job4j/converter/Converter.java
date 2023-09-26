package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float rubles = 140;
        float euro = Converter.rubleToEuro(rubles);
        System.out.println(rubles + " rubles are " + euro + " euro.");

        rubles = 120;
        float dollars = Converter.rubleToDollar(rubles);
        System.out.println(rubles + " rubles are " + dollars + " dollars.");
    }
}
