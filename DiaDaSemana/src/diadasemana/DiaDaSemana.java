/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diadasemana;

import java.util.Scanner;

/* Escreva um algoritmo que leia um número inteiro (de 1 a 7) representando o dia da semana e informe o nome
do dia correspondente.*/
/**
 *
 * @author Alcid
 */
public class DiaDaSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        int dia;
        
        System.out.println("Digite o dia [1/7]: ");
        dia = tec.nextInt();
        switch (dia){
            case 1: 
                System.out.println("DOMINGO");break;
            case 2:
                System.out.println("SEGUNDA-FEIRA");break;
            case 3:
                System.out.println("TERÇA-FEIRA");break;
            case 4: 
                System.out.println("QUARTA-FEIRA");break;
            case 5: 
                System.out.println("QUINTA-FEIRA");break;
            case 6: 
                System.out.println("SEXTA-FEIRA"); break;
            case 7:
                System.out.println("SABÁDO");break;
            default:
                System.out.println("Dia inválido!");
        }
        
    }
    
}
