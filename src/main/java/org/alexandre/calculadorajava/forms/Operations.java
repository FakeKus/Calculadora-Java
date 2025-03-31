package org.alexandre.calculadorajava.forms;

import java.util.ArrayList;
import java.util.List;

public class Operations {

    //Lista para salvar o histórico de operações realizadas
    private final List<String> historicalList = new ArrayList<>();
    //Armazena o resultado da última operação realizada
    private double result;

    /**
     * Realiza a adição de dois números.
     * @param num01 Primeiro número.
     * @param num02 Segundo número.
     * @return Resultado da adição.
     */
    public double add(double num01, double num02) {
        result = num01 + num02;                                                             //Calcula o resultado da adição
        System.out.println("Adição efetuada: " + num01 + " + " + num02 + " = " + result);   //Exibe no console
        historicalList.add("Adição efetuada: " + num01 + " + " + num02 + " = " + result);   //Salva no histórico
        return result;                                                                      //Retorna o resultado
    }

    /**
     * Realiza a subtração de dois números.
     * @param num01 Primeiro número.
     * @param num02 Segundo número.
     * @return Resultado da subtração.
     */
    public double sub(double num01, double num02) {
        result = num01 - num02;                                                                 //Calcula o resultado da subtração
        System.out.println("Subtração efetuada: " + num01 + " - " + num02 + " = " + result);    //Exibe no console
        historicalList.add("Subtração efetuada: " + num01 + " - " + num02 + " = " + result);    //Salva no histórico
        return result;                                                                          //Retorna o resultado
    }

    /**
     * Realiza a multiplicação de dois números.
     * @param num01 Primeiro número.
     * @param num02 Segundo número.
     * @return Resultado da multiplicação.
     */
    public double mult(double num01, double num02) {
        result = num01 * num02;                                                                     //Calcula o resultado da multiplicação
        System.out.println("Multiplicação efetuada: " + num01 + " * " + num02 + " = " + result);    //Exibe no console
        historicalList.add("Multiplicação efetuada: " + num01 + " * " + num02 + " = " + result);    //Salva no histórico
        return result;                                                                              //Retorna o resultado
    }

    /**
     * Realiza a divisão de dois números.
     * @param num01 Primeiro número (numerador).
     * @param num02 Segundo número (denominador).
     * @return Resultado da divisão.
     */
    public double div(double num01, double num02) {
        //Tratamento para divisão por zero
        if (num02 == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            historicalList.add("Erro: Tentativa de divisão por zero: " + num01 + " / " + num02);
            return Double.NaN;  //Retorna NaN (Not a Number) neste caso
        }
        result = num01 / num02;                                                             //Calcula o resultado da divisão
        System.out.println("Divisão efetuada: " + num01 + " / " + num02 + " = " + result);  //Exibe no console
        historicalList.add("Divisão efetuada: " + num01 + " / " + num02 + " = " + result);  //Salva no histórico
        return result;                                                                      //Retorna o resultado
    }

    /**
     * Calcula a porcentagem de um número em relação a outro.
     * @param num01 Valor base (porcentagem).
     * @param num02 Valor sobre o qual a porcentagem será aplicada.
     * @return Resultado da porcentagem.
     */
    public double percent(double num01, double num02) {
        result = (num01 / 100) * num02;                                                         //Calcula o resultado da porcentagem
        System.out.println("Porcentagem efetuada: " + num01 + "% " + num02 + " = " + result);   //Exibe no console
        historicalList.add("Porcentagem efetuada: " + num01 + "% " + num02 + " = " + result);   //Salva no histórico
        return result;                                                                          //Retorna o resultado
    }

    /**
     * Retorna a lista de histórico de operações realizadas.
     * @return Lista de strings com o histórico.
     */
    public List<String> getHistoricalList(){return historicalList;}
}
