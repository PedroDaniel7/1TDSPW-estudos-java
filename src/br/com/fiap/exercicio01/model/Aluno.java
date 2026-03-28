package br.com.fiap.exercicio01.model;

public class Aluno {

    public String classe;
    public double cp1, cp2, cp3, sprint1, sprint2, gs;
    public double notafinal;
    public String nome;

    public double calcularMedia(){
        double mediaCp = (cp1+cp2)/2;
        double mediaChallenge = (sprint1 + sprint2)/2;
        double mediaFinal = mediaChallenge * 0.2 + mediaCp * 0.2 + gs * 0.6;
        return mediaFinal;

    }

}
