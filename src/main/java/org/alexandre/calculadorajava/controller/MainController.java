package org.alexandre.calculadorajava.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

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

    @FXML
    void eventButton00(ActionEvent event) {

    }

    @FXML
    void eventButton01(ActionEvent event) {

    }

    @FXML
    void eventButton02(ActionEvent event) {

    }

    @FXML
    void eventButton03(ActionEvent event) {

    }

    @FXML
    void eventButton04(ActionEvent event) {

    }

    @FXML
    void eventButton05(ActionEvent event) {

    }

    @FXML
    void eventButton06(ActionEvent event) {

    }

    @FXML
    void eventButton07(ActionEvent event) {

    }

    @FXML
    void eventButton08(ActionEvent event) {

    }

    @FXML
    void eventButton09(ActionEvent event) {

    }

    @FXML
    void eventButtonAdd(ActionEvent event) {

    }

    @FXML
    void eventButtonDel(ActionEvent event) {

    }

    @FXML
    void eventButtonDiv(ActionEvent event) {

    }

    @FXML
    void eventButtonMult(ActionEvent event) {

    }

    @FXML
    void eventButtonPerc(ActionEvent event) {

    }

    @FXML
    void eventButtonPoint(ActionEvent event) {

    }

    @FXML
    void eventButtonResult(ActionEvent event) {

    }

    @FXML
    void eventButtonSub(ActionEvent event) {

    }

    @FXML
    void eventKeyboard(KeyEvent event) {

        /**
         * NUMPAD1 NUMPAD2 NUMPAD3
         * NUMPAD4 NUMPAD5 NUMPAD6
         * NUMPAD7 NUMPAD8 NUMPAD9
         *         NUMPAD0
         *  ADD
         *  SUBTRACT
         *  MULTIPLY
         *  DIVIDE
         *  EQUALS
         */

        System.out.println(event.getCode());
        String keyboardCode = event.getCode().toString();


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

}