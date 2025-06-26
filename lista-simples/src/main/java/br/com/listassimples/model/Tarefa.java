package br.com.listassimples.model;

public class Tarefa {
    private String nome;

    public Tarefa() {
    }

    public Tarefa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
