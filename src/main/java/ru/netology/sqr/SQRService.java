package ru.netology.sqr;

public class SQRService {
    public int borderSquares(int min, int max) {

        int count = 0;
        for (int i = 1; i < max; i++) {
            if (i * i >= min) {
                if (i * i <= max) {
                    count = count + 1;
                }
            }
        }
        return count;
    }
}

