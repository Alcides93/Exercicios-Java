/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaaritmetica;

import java.util.Scanner;

/**
 *
 * @author Alcid
 */
public class MediaAritmetica {

/*  Escrever um programa que leia o nome de um aluno e as notas das três
provas que ele obteve no semestre. No final informar o nome do aluno e a
sua média (aritmética). */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        String nomeAluno;
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;
        
        System.out.println("Digite o nome do aluno: ");
        nomeAluno = tec.nextLine();
        
        System.out.println("Digite a primeira nota: ");
        nota1 = tec.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        nota2 = tec.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        nota3 = tec.nextDouble();
        
        System.out.println("Digite a quarta nota: ");
        nota4 = tec.nextDouble();
        
        media = (nota1 + nota2 + nota3 + nota4)/4;
        
        System.out.println("A média de " + nomeAluno + " é " + media);
    }
    
}
