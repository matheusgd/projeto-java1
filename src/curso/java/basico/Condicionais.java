/*JDEV Treinamentos Aula [8.1 e 8.2]
* Condicionais IF e ELSE e Operadores ternários*/
package curso.java.basico;

public class Condicionais {

    public static void main(String[] args) {

        int nota1 = 80;
        int nota2 = 70;
        int nota3 = 90;
        int nota4 = 70;

        //int mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;
        int mediaAluno = 100;
        String nome = "Matheus";

        /* if (mediaAluno >= 90 && mediaAluno <= 100){

            System.out.println("Parabéns, vc está aprovado com HONRRA");

        } else if (mediaAluno >= 70 && nome.equals("Matheus") && mediaAluno <= 89){ // .equals() é para testar uma String, se é igual ou não

            System.out.println("Parabéns vc está aprovado!");

        } else if (mediaAluno <= 69 && mediaAluno >= 30){

            System.out.println("Vc está em recuperação");

        } else if (mediaAluno <= 29){

            System.out.println("Aluno reprovado");

        } else{
            System.out.println("Digite um número válido");

        } */

        /* Operadores Ternários
        * É uma forma resumida de fazer o IF e Else, usado em microsserviços */

        String saidaResultado = saidaResultado = mediaAluno >=70 ? "Aluno Aprovado" : (mediaAluno <= 69 && mediaAluno >= 30) ? "Aluno em Recuperação" : "Aluno Reprovado";
        System.out.println(saidaResultado);


    }
}
