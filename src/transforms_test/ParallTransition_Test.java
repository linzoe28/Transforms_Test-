/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transforms_test;

import javafx.animation.ParallelTransition;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.QuadCurveTo;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author User
 */
public class ParallTransition_Test extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Circle circle = new Circle(100, 100, 50, Color.BLUEVIOLET);
        Rectangle rect = new Rectangle(100, 100, 300, 200);
        Shape shape=Shape.intersect(rect, circle);  //組合圖形
        root.getChildren().add(shape);
        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.seconds(5));
        pathTransition.setNode(shape);

        RotateTransition rotateTransition = new RotateTransition(Duration.millis(100));
        rotateTransition.setFromAngle(0);
        rotateTransition.setToAngle(360);
        rotateTransition.setCycleCount(50);

        Path path = new Path();
        path.getElements().addAll(
                new MoveTo(20, 20), new LineTo(100, 60), new LineTo(300, 160), new QuadCurveTo(400, 500, 750, 600)
        );
        pathTransition.setPath(path);

        ParallelTransition parallelTransition = new ParallelTransition(shape, rotateTransition, pathTransition);  //不同的Transition，合併一起撥放動作
        parallelTransition.play();

        Scene scene = new Scene(root, 800, 750);

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
