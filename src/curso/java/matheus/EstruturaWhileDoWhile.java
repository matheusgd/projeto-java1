/* Estrutura de repetição While e Do While [Modulo 8.6] */
package curso.java.matheus;

public class EstruturaWhileDoWhile {

    public static void main(String[] args) {

        int numero = 0;

        while(numero <=10) { /*Verifica e depois executa*/
            System.out.println("O numero atual é: " + numero);
            numero++;
        }

        int numero2 = 0;

        do {/* Primeiro executa e depois verifica*/
            System.out.println("O número atual é: " + numero2);
            numero2++;

        } while(numero2 <= 60);



    }

}
