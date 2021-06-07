/* Estrutura de Repetição FOR com BREAK (Parada) e CONTINUE [Módulo 8.8 e 8.9] */
package curso.java.basico;

public class EstruturaForBreakContinue {

    public static void main(String[] args) {

        /* for (int numero = 0; numero <= 10; numero ++){
            if(numero == 3){
                System.out.println("Encontrei o número: " + numero);
                System.out.println("Parando a execução...");
                break;
            }
        } */

        for (int numero = 0; numero <= 10; numero ++) {
            if (numero == 3 || numero == 6 || numero == 9) {
                System.out.println("Encontrei o número: " + numero);
                continue;
            }
            System.out.println("Processando laço de repetição...");

        }

    }

}
