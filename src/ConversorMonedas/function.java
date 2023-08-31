package ConversorMonedas;

import javax.swing.*;

public class function {

    ConvertirMonedas monedas = new ConvertirMonedas();
    MonedasAPesos pesos = new MonedasAPesos();

    public void ConvertirMonedas(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null,
                "Elije la moneda a la que deseas convertir tu dinero ", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"},
                "Seleccion")).toString();
        switch (opcion) {
            case "De Pesos a Dólar" -> monedas.ConvertirPesosADolares(Minput);
            case "De Pesos a Euro" -> monedas.ConvertirPesosAEuros(Minput);
            case "De Pesos a Libras" -> monedas.ConvertirPesosALibras(Minput);
            case "De Pesos a Yen" -> monedas.ConvertirPesosAYen(Minput);
            case "De Pesos a Won Coreano" -> monedas.ConvertirPesosAWon(Minput);
            case "De Dólar a Pesos" -> pesos.ConvertirDolaresAPesos(Minput);
            case "De Euro a Pesos" -> pesos.ConvertirEurosAPesos(Minput);
            case "De Libras a Pesos" -> pesos.ConvertirLibrasAPesos(Minput);
            case "De Yen a Pesos" -> pesos.ConvertirYenAPesos(Minput);
            case "De Won Coreano a Pesos" -> pesos.ConvertirWonAPesos(Minput);
        }
    }

}
