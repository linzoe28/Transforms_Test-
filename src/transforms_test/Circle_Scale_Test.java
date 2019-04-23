/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transforms_test;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class Circle_Scale_Test extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();
        Group root = new Group();
        borderPane.setCenter(root);
        Circle circle = new Circle(300, 300, 100);
        root.getChildren().add(circle);
        circle.setFill(Color.CORAL);
        Slider slider = new Slider(0.1, 3, 1);
        borderPane.setBottom(slider);

        Scale scale = new Scale(1, 1, 300, 300);
        circle.getTransforms().add(scale);

        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                double sclaeValue = newValue.doubleValue();
                scale.setX(sclaeValue);
                scale.setY(sclaeValue);
            }
        });

        Scene scene = new Scene(borderPane, 800, 800);

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
