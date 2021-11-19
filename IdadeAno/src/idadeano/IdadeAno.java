/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idadeano;

import java.util.Scanner;

/* Escreva um algoritmo que leia o ano de nascimento de uma pessoa e apresente uma linha do tempo,
mostrando cada ano de vida da pessoa e quantos anos ela tinha em cada ano até o ano atual.*/
/**
 *
 * @author Alcid
 */
public class IdadeAno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        int i,anoNascimento, anoAtual, idade;
        
        System.out.println("Digite o ano de Nascimento: ");
        anoNascimento = tec.nextInt();
        System.out.println("Digite o ano atual: ");
        anoAtual = tec.nextInt();
        
        System.out.println("Linha do tempo: ");
        System.out.println("Ano - Idade ");
        for (i = anoNascimento, idade = 0; i <= anoAtual; i++, idade++ ){
            
            System.out.println(i + " - " + idade);
        }
    }
    
}
