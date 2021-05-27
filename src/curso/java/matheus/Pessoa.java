package curso.java.matheus;

import java.util.Date;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;
    private Date dataNascimento;
    // git ignore 2

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }

}

