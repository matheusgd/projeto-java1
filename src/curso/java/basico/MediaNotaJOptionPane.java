package curso.java.basico;

import javax.swing.*;

public class MediaNotaJOptionPane {

    public static void main(String[] args) {

        String nota1 = JOptionPane.showInputDialog("Informe a nota do 1º Bimestre: ");
        String nota2 = JOptionPane.showInputDialog("Informe a nota do 2º Bimestre: ");
        String nota3 = JOptionPane.showInputDialog("Informe a nota do 3º Bimestre: ");
        String nota4 = JOptionPane.showInputDialog("Informe a nota do 4º Bimestre: ");

        double dNota1 = Double.parseDouble(nota1);
        double dNota2 = Double.parseDouble(nota2);
        double dNota3 = Double.parseDouble(nota3);
        double dNota4 = Double.parseDouble(nota4);

        double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver sua Média?");

        if (resposta == 0) {
            if (media >= 50) {
                if (media >= 90) {
                    JOptionPane.showMessageDialog(null, "Você está APROVADO com Sucesso, PARABÉNS!");
                } else {
                    JOptionPane.showMessageDialog(null, "Você está APROVADO!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Você está REPROVADO!");
            }
        } else {
            System.out.println("Não quiz ver a média!");
        }

    }

}
