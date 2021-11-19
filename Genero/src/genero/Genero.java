/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genero;

import java.util.Scanner;

/* Escreva um algoritmo que leia uma letra que represente o sexo de uma pessoa (M para Masculino e F para
feminino). Se for masculino, mostra a mensagem “Seja bem-vindo, Senhor!”, se for feminino, mostra a
mensagem “Seja bem-vinda, Senhora!”. */
/**
 *
 * @author Alcid
 */
public class Genero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        String genero;
        
        System.out.println("Digite seu Genero(M - para masculino / F - para feminino): ");
        genero = tec.nextLine();
        
        if(genero.equals("M")){
            System.out.println("Seja bem-vindo, Senhor!");
        }else{
            System.out.println("Seja bem-vinda, Senhora!");
        }
        
    }
    
}
