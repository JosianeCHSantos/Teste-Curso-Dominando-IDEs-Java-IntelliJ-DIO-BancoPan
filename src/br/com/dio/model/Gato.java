package br.com.dio.model;

import java.util.Objects;

public class Gato {
    private String nome;
    private String cor;
    private Integer idade;

    //para criar um construtor: ALT Insert e seleciona Constructor

//na linha abaixo foi criado um construtor vazio selecionando apenas "br.com.dio"

    public Gato() {}


//na linha abaixo foi criado um construtor com todos os atributos da classe, selecionando todos da lista
// segurando a tecla Shift e a setinha para baixo, OK;

    public Gato(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    //Criando Getter and Setter - clicando com ALT Insert e selecionando "Getter and Setter"
    // selecionando todos da lista, segurando a tecla Shift e a setinha para baixo, OK;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    //Criando equals and hashCode - clicando com ALT Insert e selecionando "equals and hashCode"
    //Clicar em next, next, create;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(cor, gato.cor) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    //Criano toString - clicando com ALT Insert e selecionando "toString"
    // selecionando todos da lista, segurando a tecla Shift e a setinha para baixo, OK;

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }
}
