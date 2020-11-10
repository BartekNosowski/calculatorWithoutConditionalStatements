package com.company;

import java.util.HashMap;
import java.util.Map;

public class CALC {
    /**
     * Tworzymy mapę która przechowywać będzie lambdy i symbol kalkulacji
     * Parametrami jest String oraz nasz interfejs funkcjonalny
     */
    private static final Map<String, CalculationInterface> calculationMap = new HashMap<>();

    public static void main(String[] args) {
        fillMap();
        result("+", 7, 9);
        result("-", 0, 4);
        result("*", 5, 6);
        result("/", 8, 3);
        result("%", 5, 2);
    }

    /**
     * Wprowadzenie do mapy symbolu kalkulacji i użycie lambd
     */
    private static void fillMap() {
        calculationMap.put("+", (a, b) -> a + b);
        calculationMap.put("-", (a, b) -> a - b);
        calculationMap.put("*", (a, b) -> a * b);
        calculationMap.put("/", (a, b) -> a / b);
        calculationMap.put("%", (a, b) -> a % b);
    }

    /**
     * Metoda poniżej zwraca gotowy wynik po wybraniu operatorem odpowiedniej lambdy i wykonaniu metody calculate()
     *
     * @param operator
     * @param a
     * @param b
     */
    private static void result(String operator, int a, int b) {
        int result = (int) calculationMap.get(operator).calculate(a, b);
        System.out.println(result);
    }
}
