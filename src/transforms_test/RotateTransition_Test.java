/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transforms_test;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author User
 */
public class RotateTransition_Test extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Group root=new Group();
        Rectangle rect=new Rectangle(100, 100, 300, 200);
        root.getChildren().add(rect);
        RotateTransition rotateTransition=new RotateTransition(Duration.seconds(3),rect);
        rotateTransition.setFromAngle(20);
        rotateTransition.setToAngle(180);
        rotateTransition.setCycleCount(2);
        rotateTransition.play();
        Scene scene = new Scene(root, 600, 600);
        
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
