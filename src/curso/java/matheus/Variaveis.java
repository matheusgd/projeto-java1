/*JDEV Treinamentos - Aula sobre Estruturas de declaração de variáveis [modulo 7.4 e 7.5] */
package curso.java.matheus;

public class Variaveis {

    /* Variável Global é acessível a todos os métodos na classe */
    static int maiorIdadeGlobal = 30;

    public static void main(String[] args) {

        /* As variáveis deve ser com nomes parecidos com o conteúdo das mesmas
        * para que o programador não fique perdido em uma futura manutenção
        * nomes de variáveis sempre começam com letras e minúsculas, nunca começar com números */
        int maiorIdade = 18;

        /* Variável local porque pertence somente a esse método*/
        int idosoIdade = 60;

        int jovemIdade = 16;

        int criancaIdade = 7;

        String cpf = "123.147.852-61";

        System.out.println("Maior idade é = " + maiorIdade);
        System.out.println("Menor idade é = " + jovemIdade);
        System.out.println("Terceira idade é = " + idosoIdade);
        System.out.println("Idade juvenil é = " + criancaIdade);
        System.out.println("Cpf é = " + cpf);

        //Chamando o método fora do main
        metodo2();
    }

    /* O segundo método não pode ser executado, somente o main faz essa função
    * Para executar este método, o mesmo deve ser invocado dentro do main*/
    public static void metodo2 () {
        System.out.println("Valor da variável Global = " + maiorIdadeGlobal);

    }

}
