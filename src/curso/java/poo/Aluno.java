package curso.java.poo;

import java.util.Objects;

public class Aluno {

    /* Atributos da classe Aluno (Características)*/
    private String nome;
    private int idade;
    private String dataNascimento;
    private String registroGeral;
    private String numeroCpf;
    private String nomeMae;
    private String nomePai;
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;

    private Disciplina disciplina = new Disciplina();



    /* Construtor Padrão
    (Se não criar automaticamente o Java
    executa ele por trás do código)*/
    public Aluno() {
    }

    /* Outros Construtores */
    public Aluno(String nomePadrao) {
        nome = nomePadrao;
    }

    public Aluno(String nomePadrao, int idadePadrao) {
        nome = nomePadrao;
        idade = idadePadrao;
    }

    /* Getters e Setter de todos os atributos */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    // Método retornando o resultado da média
    public double getMediaNota() { //Não precisa criar o set de Média Nota pois o mesmo não vai settar nada
        return (disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3() + disciplina.getNota4()) / 4;
    }

    //Métodos para fazer o teste da média, se o aluno está aprovado ou não
    public boolean getAlunoAprovado() {
        double media = this.getMediaNota();

        if (media >= 70) {
            return true;
        } else {
            return false;
        }
    }

    /* Mesmo método acima, porém com String */
    public String getAlunoAprovado2(){
        double media = this.getMediaNota();

        if(media >= 70){
            return "O Aluno está aprovado";
        }else {
            return "O Aluno está reprovado";
        }
    }

    // Invocando o toString, ele é gerado para reunir a informações de todos os atributos
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", dataMatricula='" + dataMatricula + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", serieMatriculado='" + serieMatriculado + '\'' +
                ", disciplina=" + disciplina +
                '}';
    }

    // Utilizanbdo o equals e hash code para testar coteudos
    // da variável, verificação se são iguais ou não
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return nome.equals(aluno.nome) && numeroCpf.equals(aluno.numeroCpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numeroCpf);
    }
}
