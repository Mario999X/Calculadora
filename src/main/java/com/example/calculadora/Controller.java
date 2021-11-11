package com.example.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

class Controller {

    @FXML
    private Label pantalla;
    private boolean comenzar = true;
    private Model model = new Model();

    public Controller(Label numero) {
        this.pantalla = numero;
    }

    public void manejaBotonNumerico(ActionEvent e){
        pantalla.setText(pantalla.getText()+ ((Button)e.getSource()).getText());
    }

    public void manejaBotonC(ActionEvent e){
        pantalla.setText("0");
    }

    public void manejaBotonOperacion(ActionEvent e){
        if (((Button)e.getSource()).getText() == "=") {
            model.setNumero2(Float.parseFloat(pantalla.getText()));
            pantalla.setText(String.valueOf(model.calcular()));
        }else{
            model.setNumero1(Float.parseFloat(pantalla.getText()));
            model.setOperador(((Button) e.getSource()).getText());
            pantalla.setText("");
        }

    }

}
