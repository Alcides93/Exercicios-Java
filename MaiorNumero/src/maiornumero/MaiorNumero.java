/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maiornumero;

//Crie um algoritmo que leia dois valores (x e y) e informe qual o maior valor.

import java.util.Scanner;

/**
 *
 * @author Alcid
 */
public class MaiorNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        int x,y;
        
        System.out.println("Digite um numero: ");
        x = tec.nextInt();
        System.out.println("Digite outro numero: ");
        y = tec.nextInt();
        
        if(x > y){
            System.out.println("O numero " + x + " é maior!");
        }else{
            System.out.println("O numero " + y + " é maior!");
        }
    }
    
}
