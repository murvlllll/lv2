package com.lab3;

public class App {
    public static void main(String[] args) {
        System.out.println("Факториал 5 равен: " + getFactorial(5));
    }

    public static int getFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным");
        }
        int result = 1;
        // ТУТ КРОЕТСЯ БАГ: цикл должен быть до 'i <= n', но из-за знака '<' мы не домножаем на само число n!
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
