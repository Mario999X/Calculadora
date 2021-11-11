package com.example.calculadora;


import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;


public class View extends VBox {

    private Button btnMas, btnMenos, btnMult, btnDiv, btnIgual, btnPunt, btnC, btn0, btn1, btn2, btn3,
                   btn4, btn5, btn6, btn7, btn8, btn9;
    private Label numero = new Label();
    private GridPane keyboard;
    private Controller controlador;

    public View(){
        initView();
        controlador = new Controller(numero);
        btn0.setOnAction(e -> controlador.manejaBotonNumerico(e));
        btn1.setOnAction(e -> controlador.manejaBotonNumerico(e));
        btn2.setOnAction(e -> controlador.manejaBotonNumerico(e));
        btn3.setOnAction(e -> controlador.manejaBotonNumerico(e));
        btn4.setOnAction(e -> controlador.manejaBotonNumerico(e));
        btn5.setOnAction(e -> controlador.manejaBotonNumerico(e));
        btn6.setOnAction(e -> controlador.manejaBotonNumerico(e));
        btn7.setOnAction(e -> controlador.manejaBotonNumerico(e));
        btn8.setOnAction(e -> controlador.manejaBotonNumerico(e));
        btn9.setOnAction(e -> controlador.manejaBotonNumerico(e));
        btnMas.setOnAction(e -> controlador.manejaBotonOperacion(e));
        btnMenos.setOnAction(e -> controlador.manejaBotonOperacion(e));
        btnMult.setOnAction(e -> controlador.manejaBotonOperacion(e));
        btnDiv.setOnAction(e -> controlador.manejaBotonOperacion(e));
        btnIgual.setOnAction(e -> controlador.manejaBotonOperacion(e));
        btnC.setOnAction(e -> controlador.manejaBotonC(e));

    }
   public void initView(){

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