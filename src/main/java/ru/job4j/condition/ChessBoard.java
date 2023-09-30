package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        if (!(isValid(x1) && isValid(y1) && isValid(x2) && isValid(y2))) {
            return 0;
        }

        int dx = Math.abs(x1 - x2);
        int dy = Math.abs(y1 - y2);
        if (dx != dy) {
            return 0;
        }

        return dx;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }
}
