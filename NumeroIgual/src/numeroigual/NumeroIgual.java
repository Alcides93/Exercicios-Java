/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroigual;

import java.util.Scanner;
/* Crie um algoritmo que leia dois valores (x e y)
e informe se eles são iguais.*/
/**
 *
 * @author Alcid
 */
public class NumeroIgual {

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
        
        if(x==y){
            System.out.println("Os numeros são iguais!");
        }else{
            System.out.println("Os numeros são diferentes!");
        }
        
        
    }
    
}
