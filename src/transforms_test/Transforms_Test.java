/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transforms_test;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class Transforms_Test extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Rectangle rect0 = new Rectangle(50, 50, 300, 100);
        root.getChildren().add(rect0);
        rect0.setFill(Color.ORANGE);

        Rectangle rect1 = new Rectangle(50, 50, 300, 100);
        root.getChildren().add(rect1);
        rect1.setFill(Color.BISQUE);
        Rotate rotate=new Rotate(30);
        rect1.getTransforms().addAll(rotate);
        
        Rectangle rect2 = new Rectangle(50, 50, 300, 100);
        root.getChildren().add(rect2);
        rect2.setFill(Color.BLUEVIOLET);
        Rotate rotate1=new Rotate(30,200,100);
        rect2.getTransforms().addAll(rotate1);

        Scene scene = new Scene(root, 500, 500);

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
