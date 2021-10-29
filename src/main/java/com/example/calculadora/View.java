package com.example.calculadora;


import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class View extends VBox {
    private int cont;
    private Button btnMas;
    private Button btnMenos;
    private Button btnMult;
    private Button btnDiv;
    private Button btnIgual;
    private Button btnPunt;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Label label;
    private HBox keyboard;
    View(){
        cont=0;
        label = new Label("0");
        btnMas = new Button("+");
        btnMenos = new Button("-");
        btnMas = new Button("+");
        btnMenos = new Button("-");

        keyboard =new HBox();

        this.getChildren().add(label);
        keyboard.getChildren().addAll(btnMas,btnMenos);
        btnMas.setOnAction((ActionEvent e)-> cont+=1);
        btnMas.setOnAction((ActionEvent e)-> {
            cont+=1;
            label.setText(""+cont);
        });
        btnMenos.setOnAction((ActionEvent e)->{
            cont-=1;
            label.setText(""+cont);
        });
        this.getChildren().add(keyboard);
    }
}