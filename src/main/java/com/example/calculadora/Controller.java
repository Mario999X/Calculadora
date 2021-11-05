package com.example.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

class MainController {

    @FXML
    private Label resultado;
    private long numero1 = 0;
    private long numero2 = 0;
    private String operador = "";
    private boolean comenzar = true;
    private Model model = new Model();

    @FXML
    private void procesadorNumeros(ActionEvent evento){
        if (comenzar){
            resultado.setText("");
            comenzar = false;
        }
        String valor = ((Button)evento.getSource()).getText();
        resultado.setText(resultado.getText() + valor);
    }
    @FXML
    private void procesadorOperador(ActionEvent evento){
        String valor = ((Button) evento.getSource()).getText();
        if (!valor.equals("=")){
            if(operador.isEmpty())
                return;
            operador = valor;
            numero1 = Long.parseLong(resultado.getText());
            resultado.setText("");
        }else{
            if (!operador.isEmpty())
                return;
            numero2 = Long.parseLong(resultado.getText());
            float output = model.calcular(numero1, numero2, operador);
            resultado.setText(String.valueOf(output));
            operador = "";
            comenzar = true;
        }

    }

}