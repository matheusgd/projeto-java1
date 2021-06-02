/* Operador Switch e Case [Modulo 8.4] */
package curso.java.matheus;

public class SwitchCase {

    public static void main(String[] args) {

        /* Switch Case: Operações Exatas*/
        int dia = 4;

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda-feira");
                break;

            case 3:
                System.out.println("Terça-feira");
                break;

            default:
                System.out.println("Outro dia qualquer " + dia);
                break;
        }

    }

}
