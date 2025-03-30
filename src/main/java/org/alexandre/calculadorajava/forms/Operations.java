package org.alexandre.calculadorajava.forms;

import java.util.ArrayList;
import java.util.List;

public class Operations {

    private List<String> historicalList = new ArrayList<>();
    private double result;

    public double add(double num01, double num02) {
        result = num01 + num02;
        System.out.println("Adição efetuada: " + num01 + " + " + num02 + " = " + result);
        historicalList.add("Adição efetuada: " + num01 + " + " + num02 + " = " + result);
        return result;
    }
    public double sub(double num01, double num02) {
        result = num01 - num02;
        System.out.println("Subtração efetuada: " + num01 + " - " + num02 + " = " + result);
        historicalList.add("Subtração efetuada: " + num01 + " - " + num02 + " = " + result);
        return result;
    }
    public double mult(double num01, double num02) {
        result = num01 * num02;
        System.out.println("Multiplicação efetuada: " + num01 + " * " + num02 + " = " + result);
        historicalList.add("Multiplicação efetuada: " + num01 + " * " + num02 + " = " + result);
        return result;
    }
    public double div(double num01, double num02) {
        result = num01 / num02;
        System.out.println("Divisão efetuada: " + num01 + " / " + num02 + " = " + result);
        historicalList.add("Divisão efetuada: " + num01 + " / " + num02 + " = " + result);
        return result;
    }
    public double percent(double num01, double num02) {
        result = (num01 / 100) * num02;
        System.out.println("Porcentagem efetuada: " + num01 + "% " + num02 + " = " + result);
        historicalList.add("Porcentagem efetuada: " + num01 + "% " + num02 + " = " + result);
        return result;
    }

    public List<String> getHistoricalList(){return historicalList;}
}
