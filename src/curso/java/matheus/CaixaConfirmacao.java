/*Explorando o JOptionPane da biblioteca de Swing do Java
* show Input Dialog - para entrada de dados do usuário
* show Confirm Dialog - para perguntar algo para o usuário, 0 = OK; 0 = SIM; 1 = NÃO, 2 = CANCELAR
* show Messege Dialog - para Mostrar a mensagem na tela para o usuário*/
package curso.java.matheus;

import javax.swing.*;

public class CaixaConfirmacao {

    public static void main(String[] args) {

        String carros = JOptionPane.showInputDialog("Informe a quantidade de carros: ");
        String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas: ");

        double carroNumero = Double.parseDouble(carros);
        double pessoaNumero = Double.parseDouble(pessoas);

        int divisao = (int) (carroNumero / pessoaNumero);
        double resto = carroNumero % pessoaNumero;


        int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESULTADO da divisão?");

        if(resposta == 0){
            JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao);
        } else {
            System.out.println("Não quiz ver o resultado da divisão");
        }

        resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESTO da divisão?");

        if (resposta == 0){
            JOptionPane.showMessageDialog(null, "Sobraram: " + resto + " carro(s)");
        } else {
            System.out.println("Não quiz ver o resultado da divisão");
        }

    }

}

