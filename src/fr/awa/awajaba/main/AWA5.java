/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.awa.awajaba.main;

import fr.awa.awajaba.entities.EvaluationRepas;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author root
 */
public class AWA5 extends Application {
    
    public TextArea TACom= new TextArea();
    
    public void start(Stage primaryStage) throws Exception {
        GridPane root = new GridPane();
        root.setPadding(new Insets(20));
        root.setHgap(25);
        root.setVgap(15);

        Label Evaluer = new Label("Evaluer votre Repas :");
        Label Commentaire = new Label("Commentaire :");
        Label Note= new Label("Note :");
        

        ToggleGroup radio = new ToggleGroup();
        RadioButton note0 = new RadioButton("0\t");
        note0.setToggleGroup(radio);
        note0.setUserData(0);
        note0.setSelected(true);
        RadioButton note1 = new RadioButton("1\t");
        note1.setToggleGroup(radio);
        note1.setUserData(1);
        RadioButton note2 = new RadioButton("2\t");
        note2.setUserData(2);
        note2.setToggleGroup(radio);
        RadioButton note3 = new RadioButton("3\t");
        note3.setUserData(3);
        note3.setToggleGroup(radio);
        RadioButton note4 = new RadioButton("4\t");
        note4.setUserData(4);
        note4.setToggleGroup(radio);
        RadioButton note5 = new RadioButton("5\t");
        note5.setUserData(5);
        note5.setToggleGroup(radio);

        Button Valider = new Button("Valider");
        Button Annuler = new Button("Annuler");
        Annuler.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                TACom.setText("");
                note0.setSelected(true);
            }
        });
        Valider.setOnAction(new EventHandler<ActionEvent>() {
            
            
            @Override
            public void handle(ActionEvent event) {
                EvaluationRepas leRepas= new EvaluationRepas(Integer.parseInt(radio.getSelectedToggle().getUserData().toString().trim()),TACom.getText());
                Alert dlgNok = new Alert (Alert.AlertType.INFORMATION);
                dlgNok.setTitle("Comfirmation");
                dlgNok.setHeaderText("Vous avez bien evalué votre repas");
                dlgNok.setContentText("Note:"+leRepas.getNote()+" Commentaire:"+leRepas.getCommentaire());
                dlgNok.showAndWait();
            }
                
               
        });
       
 
        GridPane.setHalignment(Evaluer, HPos.RIGHT);
        root.add(Evaluer, 0, 0);
        GridPane.setHalignment(Commentaire, HPos.LEFT);
        root.add(Commentaire, 0, 1);
        root.add(TACom, 0,2,6,1);

        root.add(Note, 0,3);
        root.add(note0, 0, 4);
        root.add(note1, 1, 4);
        root.add(note2, 2, 4);
        root.add(note3, 3, 4);
        root.add(note4, 4, 4);
        root.add(note5, 5, 4);

        root.add(Valider, 1, 5);
        root.add(Annuler, 0, 5);
        Scene scene = new Scene(root, 600, 300);
        primaryStage.setTitle("AWA_04");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
    
}
