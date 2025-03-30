package org.alexandre.calculadorajava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.alexandre.calculadorajava.controller.MainController;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        try {

            //Carregando o arquivo FXML
            FXMLLoader loader = new FXMLLoader(getClass()
                    .getResource("/org/alexandre/calculadorajava/fxml/main.fxml"));
            //Instanciando e setando o Controller do FXML
            MainController mainController = new MainController();
            loader.setController(mainController);
            //Criando a cena
            Parent root = loader.load();
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass()
                    .getResource("/org/alexandre/calculadorajava/styles/MainStyle.css").toExternalForm());

            //Carregando e definindo algumas configs da cena
            primaryStage.setScene(scene);                       //Definindo a cena
            primaryStage.setResizable(false);                   //Definindo a janela como não redimensionável
                                                                //Definindo o Icone da janela
            primaryStage.getIcons().add(new Image(getClass()
                    .getResourceAsStream("/org/alexandre/calculadorajava/icons/MainLogo.png")));
            primaryStage.setTitle("Calculadora - Java");        //Definindo o titulo da janela
            primaryStage.show();                                //Mostrando a janela
        } catch(Exception e) {

            System.out.println("Erro - 01");  //TO - DO
            e.printStackTrace();
        }
    }

    public static void main(String[] args){launch();}
}