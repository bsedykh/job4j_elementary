package ru.job4j.array;

public class SimpleStringEncoder {
    private static String encodeSymbol(char symbol, int counter) {
        String result = "";
        result += symbol;
        if (counter > 1) {
            result += counter;
        }
        return result;
    }

    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol != input.charAt(i)) {
                result += encodeSymbol(symbol, counter);
                symbol = input.charAt(i);
                counter = 1;
            } else {
                counter++;
            }
        }
        result += encodeSymbol(symbol, counter);
        return result;
    }
}
