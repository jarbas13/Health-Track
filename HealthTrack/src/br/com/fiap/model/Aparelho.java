package br.com.fiap.model;

public class Aparelho {

    private int id;
    private String nomeAparelho;
    private int repeticoes;
    private double cargaAparelho;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeAparelho() {
        return nomeAparelho;
    }

    public void setNomeAparelho(String nomeAparelho) {
        this.nomeAparelho = nomeAparelho;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public double getCargaAparelho() {
        return cargaAparelho;
    }

    public void setCargaAparelho(double cargaAparelho) {
        this.cargaAparelho = cargaAparelho;
    }
}
