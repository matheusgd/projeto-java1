/* Modulo [9.6 a 9.14]*/
package curso.java.poo;

import javax.swing.*;

public class AlunoExecutavel {

    public static void main(String[] args) {

        /* new Aluno() é a instância do objeto (sua criação) */
        /* aluno1 seria uma referencia para o objeto Aluno */
        System.out.println("------------------CADASTRO DE ALUNOS COM GET, SET, JOptionPane---------------------");

        // Instânciando o novo Objeto Aluno1
        Aluno aluno1 = new Aluno();

        // Recebendo informações através de entrada de dados do usuário (Input com Interface gráfica)
        String nome = JOptionPane.showInputDialog("Qual seu nome? "); // Recebendo com JOptionPane e passando para variável nome
        String idade = JOptionPane.showInputDialog("Qual sua idade? ");
        String dtNasc = JOptionPane.showInputDialog("Data de Nascimento: ");
        String rg = JOptionPane.showInputDialog("RG: ");
        String cpf = JOptionPane.showInputDialog("CPF: ");
        String mae = JOptionPane.showInputDialog("Nome da mãe: ");
        String pai = JOptionPane.showInputDialog("Nome do pai: ");
        String dtMat = JOptionPane.showInputDialog("Data da matricula: ");
        String escola = JOptionPane.showInputDialog("Nome da escola: ");
        String serie = JOptionPane.showInputDialog("Série atual: ");
        String nota1 = JOptionPane.showInputDialog("Nota 1: ");
        String nota2 = JOptionPane.showInputDialog("Nota 2: ");
        String nota3 = JOptionPane.showInputDialog("Nota 3: ");
        String nota4 = JOptionPane.showInputDialog("Nota 4: ");

        // Passando a informação recebida para o método Setter (setando a informação na variável lá na outra classe Aluno)
        aluno1.setNome(nome);
        aluno1.setIdade(Integer.parseInt(idade)); // Integer.parseInt - converte String em Int
        aluno1.setDataNascimento(dtNasc);
        aluno1.setRegistroGeral(rg);
        aluno1.setNumeroCpf(cpf);
        aluno1.setNomeMae(mae);
        aluno1.setNomePai(pai);
        aluno1.setDataMatricula(dtMat);
        aluno1.setNomeEscola(escola);
        aluno1.setSerieMatriculado(serie);
        aluno1.setNota1(Double.parseDouble(nota1)); // Double.parseDouble - converte String em Double
        aluno1.setNota2(Double.parseDouble(nota2));
        aluno1.setNota3(Double.parseDouble(nota3));
        aluno1.setNota4(Double.parseDouble(nota4));

        // Mostrando as informações na tela para o usuário
        System.out.println("ALUNO 1 Nome = " + aluno1.getNome());
        System.out.println("ALUNO 1 Idade = " + aluno1.getIdade());
        System.out.println("ALUNO 1 Data Nascimento = " + aluno1.getDataNascimento());
        System.out.println("ALUNO 1 Registro Geral = " + aluno1.getRegistroGeral());
        System.out.println("ALUNO 1 Número CPF = " + aluno1.getNumeroCpf());
        System.out.println("ALUNO 1 Nome da Mãe = " + aluno1.getNomeMae());
        System.out.println("ALUNO 1 Nome do pai = " + aluno1.getNomePai());
        System.out.println("ALUNO 1 Data Matricula = " + aluno1.getDataMatricula());
        System.out.println("ALUNO 1 Nome Escola = " + aluno1.getNomeEscola());
        System.out.println("ALUNO 1 Série = " + aluno1.getSerieMatriculado());
        System.out.println("ALUNO 1 Média de notas = " + aluno1.getMediaNota());
        System.out.println("ALUNO 1 Resultado = " + (aluno1.getAlunoAprovado() ? "Aluno Aprovado" : "Aluno Reprovado"));
        System.out.println("ALUNO 1 Resultado 2 = " + aluno1.getAlunoAprovado2());
        System.out.println("--------------------------------------------------------------------------");

        /* Mesmo processo acima, porém sem receber interação do usuário

        Aluno aluno2 = new Aluno(); //Aqui será o Pedro

        aluno2.setNome("Pedro Nascimento");
        aluno2.setIdade(15);
        aluno2.setDataNascimento("02/02/2008");
        aluno2.setRegistroGeral("47523100");
        aluno2.setNumeroCpf("987.754.844-20");
        aluno2.setNomeMae("Juliana Pedrosa Nascimento");
        aluno2.setNomePai("Douglas Nascimento");
        aluno2.setDataMatricula("01/05/2021");
        aluno2.setNomeEscola("CEF 308");
        aluno2.setSerieMatriculado("10º Ano");
        aluno2.setNota1(90.7);
        aluno2.setNota2(90.3);
        aluno2.setNota3(80.8);
        aluno2.setNota4(85.9);

        System.out.println("ALUNO 2 Nome = " + aluno2.getNome());
        System.out.println("ALUNO 2 Idade = " + aluno2.getIdade());
        System.out.println("ALUNO 2 Data Nascimento = " + aluno2.getDataNascimento());
        System.out.println("ALUNO 2 Registro Geral = " + aluno2.getRegistroGeral());
        System.out.println("ALUNO 2 Número CPF = " + aluno2.getNumeroCpf());
        System.out.println("ALUNO 2 Nome da Mãe = " + aluno2.getNomeMae());
        System.out.println("ALUNO 2 Nome do pai = " + aluno2.getNomePai());
        System.out.println("ALUNO 2 Data Matricula = " + aluno2.getDataMatricula());
        System.out.println("ALUNO 2 Nome Escola = " + aluno2.getNomeEscola());
        System.out.println("ALUNO 2 Série = " + aluno2.getSerieMatriculado());
        System.out.println("ALUNO 2 Média de notas = " + aluno2.getMediaNota());
        System.out.println("ALUNO 2 Resultado = " + (aluno2.getAlunoAprovado() ? "Aluno Aprovado" : "Aluno Reprovado"));
        System.out.println("ALUNO 2 Resultado 2 = " + aluno2.getAlunoAprovado2());
        System.out.println("------------------------------------------------------------------");

        */

        // Outros exemplo de criação de Objetos
        Aluno aluno3 = new Aluno(); /* Construtor padrão*/
        Aluno aluno4 = new Aluno("Maria"); /* Construtor com 1 parametro*/
        Aluno aluno5 = new Aluno("José", 40); /* Construtor com 2 parametros */

    }

}
