package org.alexandre.calculadorajava;

import java.util.Objects;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.alexandre.calculadorajava.controller.MainController;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
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
            //Aplicando a folha de estilo CSS
            scene.getStylesheets().add(Objects.requireNonNull(getClass()
                    .getResource("/org/alexandre/calculadorajava/styles/MainStyle.css")).toExternalForm());

            //Carregando e definindo algumas configs da cena
            primaryStage.setScene(scene);                       //Definindo a cena
            primaryStage.setResizable(false);                   //Definindo a janela como não redimensionável
                                                                //Definindo o Icone da janela
            primaryStage.getIcons().add(new Image(Objects.requireNonNull(getClass()
                    .getResourceAsStream("/org/alexandre/calculadorajava/icons/MainLogo.png"))));
            primaryStage.setTitle("Calculadora - Java");        //Definindo o titulo da janela
            primaryStage.show();                                //Mostrando a janela

            //Configurando evento de teclado para ser tratado no controlador
            scene.setOnKeyPressed(mainController::keyEvent);
        } catch(Exception e) {

            //Exibindo uma mensagem de erro genérica
            System.out.println("Erro - 01: (App.java)");
            //TODO: Informar o usuário adequadamente
            //e.printStackTrace(); //TODO: (Comente para evitar poluição no console)
        }
    }

    public static void main(String[] args){launch();}
}