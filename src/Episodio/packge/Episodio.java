package Episodio.packge;

import calculos.Classification;

public class Episodio implements Classification {
    private int numero;
    private String nome;
    private String serie;

    public int getTotalViwes() {
        return totalViwes;
    }

    public void setTotalViwes(int totalViwes) {
        this.totalViwes = totalViwes;
    }

    private int totalViwes;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public int getClassification() {
        if (totalViwes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
