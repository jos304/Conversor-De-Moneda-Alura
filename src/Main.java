import ConversorMonedas.function;
import conversorTemperatura.functionTemperatura;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {

    function monedas = new function();
    functionTemperatura temperatura = new functionTemperatura();
    boolean continuarPrograma = true;

        while(continuarPrograma) {

            String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu",
                    JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();

            switch(opciones) {
                case "Conversor de Moneda":
                    String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                    if(ValidarNumero(input)) {
                        double Minput = Double.parseDouble(input);
                        monedas.ConvertirMonedas(Minput);

                        int confirmar = JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?", "Confirmar",
                                JOptionPane.YES_NO_CANCEL_OPTION);
                        if (confirmar == JOptionPane.NO_OPTION || confirmar == JOptionPane.CANCEL_OPTION){
                            continuarPrograma = false;
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                        }else if (JOptionPane.OK_OPTION == confirmar){
                            System.out.println("Selecciona opción Afirmativa");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;


                case "Conversor de Temperatura":
                    input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
                    if(ValidarNumero(input)) {
                        double Minput = Double.parseDouble(input);
                        temperatura.ConvertirTemperatura(Minput);

                        int confirmar = JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?", "Confirmar",
                                JOptionPane.YES_NO_CANCEL_OPTION);
                        if (confirmar == JOptionPane.NO_OPTION || confirmar == JOptionPane.CANCEL_OPTION){
                            continuarPrograma = false;
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                        }else if (JOptionPane.OK_OPTION == confirmar){
                            System.out.println("Selecciona opción Afirmativa");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;
            }
        }

    }
    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}