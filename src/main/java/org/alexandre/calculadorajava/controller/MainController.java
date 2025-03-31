package org.alexandre.calculadorajava.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

import org.alexandre.calculadorajava.forms.Operations;

public class MainController extends Operations {

    //Variáveis utilizadas para armazenar os números e o resultado das operações
    private double num01;       //Primeiro número inserido pelo usuário
    private double num02;       //Segundo número inserido pelo usuário
    private double result;      //Resultado da operação aritmética
    private String operation;   //Tipo de operação a ser realizada (Ex: ADD, SUBTRACT, ...)
    private boolean clean;      //Flag para indicar se a tela deve ser limpa antes do próximo número.


    @FXML
    private Button button00;

    @FXML
    private Button button01;

    @FXML
    private Button button02;

    @FXML
    private Button button03;

    @FXML
    private Button button04;

    @FXML
    private Button button05;

    @FXML
    private Button button06;

    @FXML
    private Button button07;

    @FXML
    private Button button08;

    @FXML
    private Button button09;

    @FXML
    private Button buttonAdd;

    @FXML
    private Button buttonDel;

    @FXML
    private Button buttonDiv;

    @FXML
    private Button buttonMult;

    @FXML
    private Button buttonPerc;

    @FXML
    private Button buttonPoint;

    @FXML
    private Button buttonResult;

    @FXML
    private Button buttonSub;

    @FXML
    private ImageView imageBtnAdd;

    @FXML
    private ImageView imageBtnDiv;

    @FXML
    private ImageView imageBtnMult;

    @FXML
    private ImageView imageBtnPerc;

    @FXML
    private ImageView imageBtnSub;

    @FXML
    private Label labelBott;

    @FXML
    private Label labelTop;

    //Métodos associados a eventos dos botões numéricos
    @FXML
    void eventButton00(ActionEvent event){printNum("0");}
    @FXML
    void eventButton01(ActionEvent event){printNum("1");}
    @FXML
    void eventButton02(ActionEvent event){printNum("2");}
    @FXML
    void eventButton03(ActionEvent event){printNum("3");}
    @FXML
    void eventButton04(ActionEvent event){printNum("4");}
    @FXML
    void eventButton05(ActionEvent event){printNum("5");}
    @FXML
    void eventButton06(ActionEvent event){printNum("6");}
    @FXML
    void eventButton07(ActionEvent event){printNum("7");}
    @FXML
    void eventButton08(ActionEvent event){printNum("8");}
    @FXML
    void eventButton09(ActionEvent event){printNum("9");}
    @FXML
    void eventButtonPoint(ActionEvent event){printNum(",");}

    //Métodos associados a eventos de botões de operações matemáticas
    @FXML
    void eventButtonAdd(ActionEvent event){choiceOperation("ADD");}
    @FXML
    void eventButtonSub(ActionEvent event){choiceOperation("SUBTRACT");}
    @FXML
    void eventButtonMult(ActionEvent event){choiceOperation("MULTIPLY");}
    @FXML
    void eventButtonDiv(ActionEvent event){choiceOperation("DIVIDE");}
    @FXML
    void eventButtonPerc(ActionEvent event){choiceOperation("PERCENTAGE");}

    @FXML
    void eventButtonDel(ActionEvent event){clearText();}        //Botão para limpar a tela
    @FXML
    void eventButtonResult(ActionEvent event){finalResult();}   //Calcula e exibe o resultado final

    //Método para lidar com eventos de teclado
    public void keyEvent(KeyEvent event) {
        /*-----------------------------------------
         *  Codigos dos números do NumPad
         *-----------------------------------------
         * NUMPAD1 NUMPAD2 NUMPAD3
         * NUMPAD4 NUMPAD5 NUMPAD6
         * NUMPAD7 NUMPAD8 NUMPAD9
         *         NUMPAD0
         *-----------------------------------------
         *  Codigo das operações
         *-----------------------------------------
         * ADD
         * SUBTRACT
         * MULTIPLY
         * DIVIDE
         * DECIMAL
         * EQUALS      /       ENTER
         */

        System.out.println(event.getCode());
        String keyboardCode = event.getCode().toString();

        switch (keyboardCode) {
            case "ENTER":
                this.buttonResult.fire();
                break;
            case "ADD":
                this.buttonAdd.fire();
                break;
            case "SUBTRACT":
                this.buttonSub.fire();
                break;
            case "MULTIPLY":
                this.buttonMult.fire();
                break;
            case "DIVIDE":
                this.buttonDiv.fire();
                break;
            case "DECIMAL":
                this.buttonPoint.fire();
                break;
            case "NUMPAD1":
                this.button01.fire();
                break;
            case "NUMPAD2":
                this.button02.fire();
                break;
            case "NUMPAD3":
                this.button03.fire();
                break;
            case "NUMPAD4":
                this.button04.fire();
                break;
            case "NUMPAD5":
                this.button05.fire();
                break;
            case "NUMPAD6":
                this.button06.fire();
                break;
            case "NUMPAD7":
                this.button07.fire();
                break;
            case "NUMPAD8":
                this.button08.fire();
                break;
            case "NUMPAD9":
                this.button09.fire();
                break;
            case "NUMPAD0":
                this.button00.fire();
                break;
        }
    }

    @FXML
    void initialize() {
        assert button00 != null : "fx:id=\"button00\" was not injected: check your FXML file 'main.fxml'.";
        assert button01 != null : "fx:id=\"button01\" was not injected: check your FXML file 'main.fxml'.";
        assert button02 != null : "fx:id=\"button02\" was not injected: check your FXML file 'main.fxml'.";
        assert button03 != null : "fx:id=\"button03\" was not injected: check your FXML file 'main.fxml'.";
        assert button04 != null : "fx:id=\"button04\" was not injected: check your FXML file 'main.fxml'.";
        assert button05 != null : "fx:id=\"button05\" was not injected: check your FXML file 'main.fxml'.";
        assert button06 != null : "fx:id=\"button06\" was not injected: check your FXML file 'main.fxml'.";
        assert button07 != null : "fx:id=\"button07\" was not injected: check your FXML file 'main.fxml'.";
        assert button08 != null : "fx:id=\"button08\" was not injected: check your FXML file 'main.fxml'.";
        assert button09 != null : "fx:id=\"button09\" was not injected: check your FXML file 'main.fxml'.";
        assert buttonAdd != null : "fx:id=\"buttonAdd\" was not injected: check your FXML file 'main.fxml'.";
        assert buttonDel != null : "fx:id=\"buttonDel\" was not injected: check your FXML file 'main.fxml'.";
        assert buttonDiv != null : "fx:id=\"buttonDiv\" was not injected: check your FXML file 'main.fxml'.";
        assert buttonMult != null : "fx:id=\"buttonMult\" was not injected: check your FXML file 'main.fxml'.";
        assert buttonPerc != null : "fx:id=\"buttonPerc\" was not injected: check your FXML file 'main.fxml'.";
        assert buttonPoint != null : "fx:id=\"buttonPoint\" was not injected: check your FXML file 'main.fxml'.";
        assert buttonResult != null : "fx:id=\"buttonResult\" was not injected: check your FXML file 'main.fxml'.";
        assert buttonSub != null : "fx:id=\"buttonSub\" was not injected: check your FXML file 'main.fxml'.";
        assert imageBtnAdd != null : "fx:id=\"imageBtnAdd\" was not injected: check your FXML file 'main.fxml'.";
        assert imageBtnDiv != null : "fx:id=\"imageBtnDiv\" was not injected: check your FXML file 'main.fxml'.";
        assert imageBtnMult != null : "fx:id=\"imageBtnMult\" was not injected: check your FXML file 'main.fxml'.";
        assert imageBtnPerc != null : "fx:id=\"imageBtnPerc\" was not injected: check your FXML file 'main.fxml'.";
        assert imageBtnSub != null : "fx:id=\"imageBtnSub\" was not injected: check your FXML file 'main.fxml'.";
        assert labelBott != null : "fx:id=\"labelBott\" was not injected: check your FXML file 'main.fxml'.";
        assert labelTop != null : "fx:id=\"labelTop\" was not injected: check your FXML file 'main.fxml'.";

        //Setando as imagens dos botões
        /*buttonAdd.setText("");
        imageBtnAdd.setImage(new javafx.scene.image.Image(getClass()
                .getResourceAsStream("/org/alexandre/calculadorajava/icons/Addition.png")));
        buttonSub.setText("");
        imageBtnSub.setImage(new javafx.scene.image.Image(getClass()
                .getResourceAsStream("/org/alexandre/calculadorajava/icons/Subtraction.png")));
        buttonMult.setText("");
        imageBtnMult.setImage(new javafx.scene.image.Image(getClass()
                .getResourceAsStream("/org/alexandre/calculadorajava/icons/Multiplication.png")));
        buttonDiv.setText("");
        imageBtnDiv.setImage(new javafx.scene.image.Image(getClass()
                .getResourceAsStream("/org/alexandre/calculadorajava/icons/Division.png")));
        buttonPerc.setText("");
        imageBtnPerc.setImage(new javafx.scene.image.Image(getClass()
                .getResourceAsStream("/org/alexandre/calculadorajava/icons/Percentage.png")));*/
    }

    //Método que exibe um número na tela
    private void printNum(String num) {
        if (clean){labelBott.setText(""); clean = !clean;}
        if (!num.equals(",")) {
            if ((labelBott.getText().isBlank() || labelBott.getText().isEmpty()) && num.equals("0")){return;}
            labelBott.setText(labelBott.getText() + num);
        } else {
            if (labelBott.getText().contains(",")){return;}
            if (!(labelBott.getText().isBlank() || labelBott.getText().isEmpty())) {
                labelBott.setText(labelBott.getText() + ",");
            } else {
                labelBott.setText("0,");
            }
        }

    }

    //Método para definir uma operação matemática a ser executada
    private void choiceOperation(String op) {
        if (labelBott.getText().isBlank() || labelBott.getText().isEmpty()){return;}
        if (labelTop.getText().isBlank() || labelTop.getText().isEmpty()) {
            num01 = Double.parseDouble(labelBott.getText().replace(",", "."));
            operation = op;

            switch (op) {
                case "ADD":
                    labelTop.setText(labelBott.getText() + " +");
                    labelBott.setText("");
                    break;
                case "SUBTRACT":
                    labelTop.setText(labelBott.getText() + " -");
                    labelBott.setText("");
                    break;
                case "MULTIPLY":
                    labelTop.setText(labelBott.getText() + " *");
                    labelBott.setText("");
                    break;
                case "DIVIDE":
                    labelTop.setText(labelBott.getText() + " /");
                    labelBott.setText("");
                    break;
                case "PERCENTAGE":
                    labelTop.setText(labelBott.getText() + "% ");
                    labelBott.setText("");
                    break;
            }
        } else {
            num02 = Double.parseDouble(labelBott.getText().replace(",", "."));
            switch (operation) {
                case "ADD":
                    result = add(num01, num02);
                    num01 = result;
                    operation = op;
                    break;
                case "SUBTRACT":
                    result = sub(num01, num02);
                    num01 = result;
                    operation = op;
                    break;
                case "MULTIPLY":
                    result = mult(num01, num02);
                    num01 = result;
                    operation = op;
                    break;
                case "DIVIDE":
                    result = div(num01, num02);
                    num01 = result;
                    operation = op;
                    break;
            }
            switch (op) {
                case "ADD":
                    labelTop.setText(String.valueOf(result).replace(".", ",") + " +");
                    labelBott.setText("");
                    break;
                case "SUBTRACT":
                    labelTop.setText(String.valueOf(result).replace(".", ",") + " -");
                    labelBott.setText("");
                    break;
                case "MULTIPLY":
                    labelTop.setText(String.valueOf(result).replace(".", ",") + " *");
                    labelBott.setText("");
                    break;
                case "DIVIDE":
                    labelTop.setText(String.valueOf(result).replace(".", ",") + " /");
                    labelBott.setText("");
                    break;
                case "PERCENTAGE":
                    labelTop.setText(String.valueOf(result).replace(".", ",") + "% ");
                    labelBott.setText("");
                    break;
            }
        }
    }

    //Método para limpar o texto exibido na calculadora e resetar variáveis
    private void clearText() {
        clean = false;
        if (labelBott.getText().isBlank() || labelBott.getText().isEmpty()) {
            num01 = 0;
            num02 = 0;
            operation = "";

            labelTop.setText("");
        } else {
            labelBott.setText("");
        }
    }

    //Método que realiza o cálculo e exibe o resultado
    private void finalResult() {
        if ((labelTop.getText().isBlank() || labelTop.getText().isEmpty())
                && (labelBott.getText().isBlank() || labelBott.getText().isEmpty())){return;}
        if ((labelBott.getText().isBlank() || labelBott.getText().isEmpty())
                && !(labelTop.getText().isBlank() || labelTop.getText().isEmpty())) {
            clean = true;
            num01 = 0;
            num02 = 0;
            operation = "";

            int auxIndex01 = labelTop.getText().indexOf(" ");
            int auxIndex02 = labelTop.getText().indexOf("%");
            if (auxIndex02 == -1){auxIndex02 = labelTop.getText().length();}
            labelBott.setText(labelTop.getText().substring(0, Math.min(auxIndex02, auxIndex01)));
            labelTop.setText("");
        } else if (!(labelBott.getText().isBlank() || labelBott.getText().isEmpty())
                && !(labelTop.getText().isBlank() || labelTop.getText().isEmpty())) {

            num02 = Double.parseDouble(labelBott.getText().replace(",", "."));
            switch (operation) {
                case "ADD":
                    result = add(num01, num02);
                    break;
                case "SUBTRACT":
                    result = sub(num01, num02);
                    break;
                case "MULTIPLY":
                    result = mult(num01, num02);
                    break;
                case "DIVIDE":
                    result = div(num01, num02);
                    break;
                case "PERCENTAGE":
                    result = percent(num01, num02);
                    break;
            }

            clean = true;
            num01 = 0;
            num02 = 0;
            operation = "";

            labelBott.setText(String.valueOf(result).replace(".", ","));
            labelTop.setText("");
        }
    }
}