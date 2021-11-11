package com.example.calculadora;

public class Model {

    private float numero1, numero2;
    private String operador;


    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }


    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }



    public float calcular (){
        switch (operador){
            case "+":
               return numero1 + numero2;

            case "-":
                return numero1 - numero2;

            case "/":
                if(numero2 == 0)
                    return 0;
                return numero1/numero2;

            case "x":
                return numero1*numero2;

            default:
                return 0;
        }


    }
}
