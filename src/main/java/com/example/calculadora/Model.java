package com.example.calculadora;

public class Model {

    public float calcular (long numero1, long numero2, String operador){
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
