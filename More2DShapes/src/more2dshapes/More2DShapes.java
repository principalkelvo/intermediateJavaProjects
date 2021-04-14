/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package more2dshapes;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
    /**
/**
 *
 * @author KELVO FRAYAY
 */
public class More2DShapes extends Application {
@Override
    public void start (Stage stage){
        //create and configure the first rectangle
        Rectangle rectangle = new Rectangle(20, 50, 40, 70);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        
        //create and configure  circle
        Circle circle= new Circle(110,80,30);
        circle.setFill(Color.RED);
        circle.setStroke(Color.RED);
        
        //create line
        Line line = new Line(20, 180, 80, 250);
        line.setFill(Color.GREEN);
        
        Line tLine = new Line(100, 70, 0, 70);
        tLine.setFill(Color.GREEN);
        Line thLine = new Line(100, 250, 100, 70);
        thLine.setFill(Color.GREEN);
        Line tbLine = new Line(400, 250,0, 70);
        tbLine.setFill(Color.GREEN);
        
        //create and configure an arc (360°)
        Arc arc= new Arc(195,80,45,35,0,360);
        arc.setFill(Color.YELLOW);
        arc.setStroke(Color.BLUE);
        arc.setType(ArcType.OPEN);
        
        //create and configure an arc (360°)
        Arc chordArc= new Arc(215,200,45,35,-90,-180);
        chordArc.setFill(Color.YELLOW);
        chordArc.setStroke(Color.BLUE);
        chordArc.setType(ArcType.CHORD);
        
        //create and configure an arc (360°)
        Arc openArc= new Arc(90,230,45,35,0,90);
        openArc.setFill(Color.ORANGE);
        openArc.setStroke(Color.BLUE);
        openArc.setType(ArcType.ROUND);
        
        //create a group that holds all the features
        Group root= new Group(/*rectangle,circle,line,arc,chordArc,openArc,*/thLine,tLine,tbLine);
        //create and configure a new scene
        Scene scene= new Scene(root,450,575,Color.WHITE);
        
        //add the scene to the stage, then set the title
        stage.setScene(scene);
        stage.setTitle("more 2D shapes");
        
        //show the stage
        stage.show();
}
    public static void main(String[] args) {
        launch(args);
    }
    
}
