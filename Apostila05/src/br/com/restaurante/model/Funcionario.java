package br.com.restaurante.model;

 public class Funcionario {
    private String nome = "João";
    private int id;
    private boolean ativo;
    private double salario;
    private char sexo;

    double calcularPlr() {
       return 0;
    }

    void colocarEmFerias() {
    }

    //Getters e Setters

    //Nome String
    public String getNome() {
       return nome;
    }

    public void setNome(String nome) {
       this.nome = nome;
    }

    //ID int
    public int getId() {
       return id;
    }

    public void setId(int id) {
       this.id = id;
    }

    //Ativo boolean
    public boolean getAtivo() {
       return ativo;
    }

    public void setAtivo(boolean ativo) {
       this.ativo = ativo;
    }

    //Salario double
    public double getSalario() {
       return salario;
    }

    public void setSalario(double salario) {
       this.salario = salario;
    }

    //Sexo char
    public char getSexo() {
       return sexo;
    }
    public void setSexo(char sexo) {
       this.sexo = sexo;
    }



 }


