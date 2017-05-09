package br.com.Modelo;

public class Avaliacao {
    private String tipo;
    private String descricao;
    private Integer pontos = 0;
    private boolean trienio = true;

    public Avaliacao(String tipo, String descricao, Integer pontos, boolean trienio) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.pontos = pontos;
        this.trienio = trienio;
    }
    
    public Avaliacao(String tipo, String descricao, Integer pontos) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.pontos = pontos;
    }
    
    public Avaliacao(String tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public Avaliacao() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public boolean isTrienio() {
        return trienio;
    }

    public void setTrienio(boolean trienio) {
        this.trienio = trienio;
    }
    
    
    
}
