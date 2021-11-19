/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trocaxy;

import java.util.Scanner;

/* Crie um algoritmo que leia as variáveis inteiras x e y e troque o valor destas variáveis. Isto é, x deve ficar com o
valor de y e y deve ficar com o valor de x. Mostre os valores depois da troca.*/
/**
 *
 * @author Alcid
 */
public class TrocaXY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        int x,y,auxiliar;
        
        System.out.println("Digite o valor x: ");
        x = tec.nextInt();
        System.out.println("Digite o valor y: ");
        y = tec.nextInt();
        auxiliar = x;
        x = y;
        y = auxiliar;
        
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }
    
}
