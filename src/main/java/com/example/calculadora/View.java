package com.example.calculadora;


import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;


public class View extends VBox {
    private int cont;
    private Button btnMas;
    private Button btnMenos;
    private Button btnMult;
    private Button btnDiv;
    private Button btnIgual;
    private Button btnPunt;
    private Button btnC;
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
    private Label numero = new Label();
    private GridPane keyboard;
    private Controller controlador;
    public View(){
        initView();
        controlador = new Controller(numero);
        btn0.setOnAction(e -> controlador.manejaBoton(e));
        btn1.setOnAction(e -> controlador.manejaBoton(e));
        btn2.setOnAction(e -> controlador.manejaBoton(e));
        btn3.setOnAction(e -> controlador.manejaBoton(e));
        btn4.setOnAction(e -> controlador.manejaBoton(e));
        btn5.setOnAction(e -> controlador.manejaBoton(e));
        btn6.setOnAction(e -> controlador.manejaBoton(e));
        btn7.setOnAction(e -> controlador.manejaBoton(e));
        btn8.setOnAction(e -> controlador.manejaBoton(e));
        btn9.setOnAction(e -> controlador.manejaBoton(e));
        btnMas.setOnAction(e -> controlador.manejaBoton(e));
        btnMenos.setOnAction(e -> controlador.manejaBoton(e));
        btnMult.setOnAction(e -> controlador.manejaBoton(e));
        btnDiv.setOnAction(e -> controlador.manejaBoton(e));
        btnIgual.setOnAction(e -> controlador.manejaResultado(e));


    }
   public void initView(){

        cont=0;
        btnMas = new Button("+");
        btnMenos = new Button("-");
        btnMult = new Button("x");
        btnDiv = new Button("/");
        btnIgual = new Button("=");
        btnPunt = new Button(".");
        btnC = new Button("C");
        btn0 = new Button("0");
        btn1 = new Button("1");
        btn2 = new Button("2");
        btn3 = new Button("3");
        btn4 = new Button("4");
        btn5 = new Button("5");
        btn6 = new Button("6");
        btn7 = new Button("7");
        btn8 = new Button("8");
        btn9 = new Button("9");

        keyboard =new GridPane();

        this.getChildren().add(numero);
        keyboard.add(btn0,1,4);
        keyboard.add(btn1,1,1);
        keyboard.add(btn4,1,2);
        keyboard.add(btn7,1,3);
        keyboard.add(btn2,2,1);
        keyboard.add(btn5,2,2);
        keyboard.add(btn8,2,3);
        keyboard.add(btnPunt,2,4);
        keyboard.add(btn3,3,1);
        keyboard.add(btn6,3,2);
        keyboard.add(btn9,3,3);
        keyboard.add(btnC,3,4);
        keyboard.add(btnMenos,4,1);
        keyboard.add(btnDiv,4,2);
        keyboard.add(btnMas,5,1);
        keyboard.add(btnMult,5,2);
        keyboard.add(btnIgual,4,3, 2,2);
        btnIgual.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btnPunt.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.getChildren().add(keyboard);


    }

}