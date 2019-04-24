/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transforms_test;

import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author User
 */
public class ScaleTransition_Test extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Image image = new Image("http://link.photo.pchome.com.tw/s08/ruby051029/19/124671242749");
        ImageView imageView = new ImageView(image);
        root.getChildren().add(imageView);
        //Rectangle rect = new Rectangle(100, 100, 300, 200);
        //root.getChildren().add(rect);
        ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(1), imageView);
        scaleTransition.setFromX(0.5);
        scaleTransition.setToX(0.8);
        scaleTransition.setFromY(0.5);
        scaleTransition.setToY(0.8);
        scaleTransition.setAutoReverse(true);
        scaleTransition.setCycleCount(10);
        scaleTransition.play();
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
