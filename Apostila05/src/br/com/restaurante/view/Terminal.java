package br.com.restaurante.view;

import br.com.restaurante.model.Funcionario;

import java.sql.SQLOutput;

public class Terminal {

    public static void main(String[] args) {
        //Criar um objeto Funcionario
        Funcionario f = new Funcionario();

        //Puxar a método criado
        f.setNome("Pedro"); // Alterar o nome do funcionário
        f.setId(45);
        f.setSexo('F');
        f.setAtivo(true);
        f.setSalario(12000);

        System.out.println(f.getNome()); // Recuperar o nome do funcionário
        System.out.println(f.getId()); // Recuperar o ID do funcionário
        System.out.println(f.getSalario()); // Recuperar o Salario do funcionário
        System.out.println(f.getSexo()); // Recuperar o Sexo do funcionário
        System.out.println(f.getAtivo()); // Recuperar a disponibilidade do funcionário
    }


}
