/* Divisões e Resto com MOD Java e Entrada e Saida de dados [Módulo 8.10 e 8.11]
* Modulo resto - %  */
package curso.java.matheus;

import javax.swing.*;

public class ModoRestoInput {

    public static void main(String[] args) {

        /* Entrada de dados com JOptionPane */
        String carros = JOptionPane.showInputDialog("Informe a quantidade de carros: ");
        String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas: ");

        /*Conversão de String para Double, para ficar divisível */
        double carroNumero = Double.parseDouble(carros);
        double pessoaNumero = Double.parseDouble(pessoas);

        int divisao = (int) (carroNumero / pessoaNumero);

        /* Módulo ou MOD: Resto da divisão */
        double resto = carroNumero % pessoaNumero;

        /* Print de saida com caixa de dialogo */
        JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao + ", Sobraram: " + resto + " carro(s)");

    }

}
