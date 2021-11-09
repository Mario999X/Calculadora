package com.example.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

class Controller {

    @FXML
    private Label resultado;
    private long numero1;
    private long numero2;
    private String operador = "";
    private boolean comenzar = true;
    private Model model = new Model();

    public Controller(Label numero) {
        this.resultado = numero;
    }

    public void manejaBoton(ActionEvent e){
        resultado.setText(resultado.getText()+ ((Button)e.getSource()).getText());
    }

    public void manejaResultado(ActionEvent e){
        resultado.setText(resultado.getText() + model.calcular(numero1,numero2,operador));
    }

    public long getNumero1() {
        return numero1;
    }

    public long getNumero2() {
        return numero2;
    }
}
