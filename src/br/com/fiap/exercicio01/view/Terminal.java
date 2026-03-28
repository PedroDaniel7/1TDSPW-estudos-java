package br.com.fiap.exercicio01.view;

import br.com.fiap.exercicio01.model.Aluno;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Terminal {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        //Criar o objeto aluno e adicionar valores nos atributos
        Aluno aluno = new Aluno();

        //Ler os dados do aluno

        System.out.println("Digite o nome: ");
        aluno.nome = leitor.next() + leitor.nextLine();

        System.out.println("Digite a nota da cp1: ");
        aluno.cp1 = leitor.nextDouble();

        System.out.println("Digite a nota da cp2: ");
        aluno.cp2 = leitor.nextDouble();

        System.out.println("Digite a nota da cp3:");
        aluno.cp3 = leitor.nextDouble();

        System.out.println("Digite a nota da sprint1:");
        aluno.sprint1 = leitor.nextDouble();

        System.out.println("Digite a nota da sprint2:");
        aluno.sprint2 = leitor.nextDouble();

        System.out.println("Digite a nota da gs:");
        aluno.gs = leitor.nextDouble();

        //Calcular a média
        double media = aluno.calcularMedia();
        System.out.println("A média do "+ aluno.nome + "é: " + media);

    }


}
