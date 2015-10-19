
package vega_3_methodsmadness;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;


public class Vega_3_MethodsMadness extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("American Flag");
        Group root = new Group();
        Canvas canvas = new Canvas(1000, 800);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawAmericanFlag(gc);
        drawRectangle(gc);
        drawStripes(gc);
        drawStripes2(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawRectangle(GraphicsContext gc) {
        gc.setFill(Color.BLUE);
        gc.fillRoundRect(100, 100, 300, 200, 0, 10);
    }
                
    private void drawAmericanFlag(GraphicsContext gc) {
        gc.setFill(Color.RED);
        gc.strokeRoundRect(100, 100, 850, 500, 0, 10);
        gc.fillRoundRect(100, 100, 850, 500, 0, 10);
    
    }
    private void drawStripes(GraphicsContext gc) {
        gc.setFill(Color.WHITE);
        gc.fillRoundRect(400, 50, 550, 100, 0, 10);
    }
    private void drawStripes2(GraphicsContext gc) {
        gc.setFill(Color.WHITE);
        gc.fillRoundRect(400, 150, 550, 100, 0, 10);
    }



}
