package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    void shouldSQRRith() {
        SQRService service = new SQRService();
        int min = 100;
        int max = 300;
        int expected= 8;
        int actual = service.borderSquares(min, max);
        assertEquals(expected, actual);
    }
    @Test
    void shouldSQRFall() {
        SQRService service = new SQRService();
        int min = 100;
        int max = 300;
        int expected= 5;
        int actual = service.borderSquares(min, max);
        assertEquals(expected, actual);
    }
}