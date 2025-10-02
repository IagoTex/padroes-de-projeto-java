package org.example.padroesComportamentais.state.context;

import org.example.padroesComportamentais.state.state.StatusPersonagem;

public class Personagem {

    private String nome;

    private double velocidade;

    private Integer vida;

    private StatusPersonagem statusPersonagem;

    public Personagem(String nome) {
        this.nome = nome;
        this.velocidade = 4.6;
        this.vida = 100;
    }

    public void aplicarStatus(){
        statusPersonagem.aplicar(this);
    }

    public void retirarStatus(){
        statusPersonagem.retirar(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public StatusPersonagem getStatusPersonagem() {
        return statusPersonagem;
    }

    public void setStatusPersonagem(StatusPersonagem statusPersonagem) {
        this.statusPersonagem = statusPersonagem;
    }
}
