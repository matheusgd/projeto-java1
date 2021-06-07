package curso.java.poo;

public class ClasseExecutavel {

    public static void main(String[] args) {

        /* new Aluno() é a instância do objeto (sua criação) */
        /* aluno1 seria uma referencia para o objeto Aluno */
        System.out.println("-------------CADASTRO DE ALUNOS COM GET E SET----------------");

        Aluno aluno1 = new Aluno(); /* Aqui será o João */

        aluno1.setNome("João da Silva");
        aluno1.setIdade(14);
        aluno1.setDataNascimento("01/01/2007");
        aluno1.setRegistroGeral("12358742");
        aluno1.setNumeroCpf("852.761.894-50");
        aluno1.setNomeMae("Josefina Pereira da Silva");
        aluno1.setNomePai("Francisco da Silva");
        aluno1.setDataMatricula("07/06/2021");
        aluno1.setNomeEscola("CEF 103");
        aluno1.setSerieMatriculado("9º Ano");
        aluno1.setNota1(80.5);
        aluno1.setNota2(90.2);
        aluno1.setNota3(70.1);
        aluno1.setNota4(75.8);

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
        System.out.println("------------------------------------------------------------------");

        Aluno aluno2 = new Aluno(); /* Aqui será o Pedro */

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

        Aluno aluno3 = new Aluno(); /* Construtor padrão*/

        Aluno aluno4 = new Aluno("Maria"); /* Construtor com 1 parametro*/

        Aluno aluno5 = new Aluno("José", 40); /* Construtor com 2 parametros */


    }

}
