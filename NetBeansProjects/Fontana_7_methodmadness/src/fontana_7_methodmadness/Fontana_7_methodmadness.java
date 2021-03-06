/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fontana_7_methodmadness;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
 
public class Fontana_7_methodmadness extends Application {
 
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Method Madness");
        Group root = new Group();
        Canvas canvas = new Canvas(300, 250);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawLeftTriangle(gc);
        drawRightTriangle(gc);
        drawTopTriangle(gc);
        drawSteamLogo(gc);
        drawSteamLogo2(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawLeftTriangle(GraphicsContext gc) {
        gc.setFill(Color.GOLD);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(3);
        gc.fillPolygon(new double[]{60, 80, 100},
                       new double[]{80, 50, 80}, 3);
        
    }
    private void drawRightTriangle(GraphicsContext gc1) {
        gc1.setFill(Color.NAVY);
        gc1.fillPolygon(new double[]{100, 120, 140},
                       new double[]{80, 50, 80}, 3);
        //Right triangle
    }
    private void drawTopTriangle(GraphicsContext gc2) {
        gc2.setFill(Color.GREEN);
        gc2.fillPolygon(new double[]{80, 100, 120},
                       new double[]{50, 20, 50}, 3);
    }
    private void drawSteamLogo(GraphicsContext gc3) {
        gc3.setStroke(Color.BLACK);
        gc3.setLineWidth(5);
        gc3.strokeLine(175, 150, 210, 170);
        gc3.strokeOval(160, 135, 30, 30);
        gc3.strokeOval(200, 160, 30, 30);
        
        //gc3.strokeLine(x1, y1, x2, y2);
    }
    private void drawSteamLogo2(GraphicsContext gc4) {
        gc4.setLineWidth(8);
        gc4.strokeLine(215, 175, 250, 135);
        gc4.strokeOval(240, 120, 30, 30);
        gc4.strokeOval(200, 160, 30, 30);
    }
}
//gc.fillPolygon(xPoints, yPoints, nPoints);