/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transforms_test;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author User
 */
public class TranslateTransition_Test extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Circle circle=new Circle(100, 100, 10, Color.BLUEVIOLET);
        root.getChildren().add(circle);
        TranslateTransition transition=new TranslateTransition(Duration.seconds(5),circle);
        transition.setFromX(100);
        transition.setToX(700);
        transition.setAutoReverse(true);
        transition.setCycleCount(2);
        transition.play();
        Scene scene = new Scene(root, 800, 600);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
