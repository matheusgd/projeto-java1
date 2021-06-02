/* Operações Aninhadas IF e ELSE [Modulo 8.3]*/
package curso.java.matheus;

public class OperacoesAninhadas {

    public static void main(String[] args) {

        int nota1 = 90;
        int nota2 = 90;
        int nota3 = 90;
        int nota4 = 90;

        int media = (nota1 + nota2 + nota3 + nota4) / 4;

        /* Operações Logicas Aninhadas: São operações dentro de operações */
        if(media >= 50){
            if (media >= 70){
                if (media >= 90){
                    System.out.println("Aluno aprovado direto, PARABÉNS! " + media);
                } else
                    System.out.println("Aluno Aprovado direto " + media);
            } else{
                System.out.println("Aluno está em recuperação " + media);
            }
        } else {
            System.out.println("Aluno reprovado direto! " + media);
        }

    }

}
