/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabuadamult;

/* Crie um algoritmo, utilizando0020laços de repetição aninhados, que exiba na tela a tabuada de
multiplicação dos números de 1 a 9.*/

/**
 *
 * @author Alcid
 */
public class TabuadaMult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        
        int i,j,resultado;
        String tipo;
        
        for(i = 1; i <= 9; i++){
            System.out.println("*** Tabuada de multiplicacao de " + i + " ***");
            for(j = 1; j <= 10; j++){
                resultado = i * j;
                System.out.println(i + " * " + j + " = " + resultado);
            }
        }
        
    }
    
}
