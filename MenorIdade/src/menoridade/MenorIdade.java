/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menoridade;

import java.util.Scanner;

/* Escreva um algoritmo que leia o nome e a idade de 10 pessoas e exiba: o nome e a idade da pessoa mais
nova.*/
/**
 *
 * @author Alcid
 */
public class MenorIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        int i, idade, idadeMaisNova;
        String nome, nomeMaisNova;
        
    System.out.println("Digite o nome:");
        nome = tec.next();
    System.out.println("Digite a idade: ");
        idade = tec.nextInt();
        
        idadeMaisNova = idade;
        nomeMaisNova = nome;
       
        for (i=1; i<=9; i++){
    System.out.println("Digite o nome:");
        nome = tec.next();
    System.out.println("Digite a idade: ");
        idade = tec.nextInt();
        
        if (idade < idadeMaisNova){
        nomeMaisNova = nome;
        idadeMaisNova = idade;
        }
        }
        System.out.println("Pessoa Mais Nova - Nome: "+ nomeMaisNova+ " Idade:"
+ idadeMaisNova);
    }
    
}
