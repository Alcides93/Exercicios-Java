/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intervalo;

import java.util.Scanner;

/* Crie um algoritmo que leia dois valores (x e y) representando um intervalo. Em seguida, leia um novo valor (z)
e verifique se z pertence ao intervalo [x, y] */
/**
 *
 * @author Alcid
 */
public class Intervalo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        int x,y,z;
        
        System.out.println("Digite o valor de x: ");
        x = tec.nextInt();
        System.out.println("Digite o valor de y: ");
        y = tec.nextInt();
        System.out.println("Digite o valor de z: ");
        z = tec.nextInt();
        
        if((z >= x) && (z <= y)){
            System.out.println("O valor " + z + " pertence ao intervalo de [ " + x + ", " + y +" ]");
        }else{
            System.out.println("O valor " + z + " NÃO pertence ao intervalo de [ " + x + ", " + y + " ]");
        }
    }
    
}
