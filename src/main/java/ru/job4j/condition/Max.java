package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int i1, int i2, int i3) {
        return max(i1, max(i2, i3));
    }

    public static int max(int i1, int i2, int i3, int i4) {
        return max(i1, max(i2, i3, i4));
    }
}
