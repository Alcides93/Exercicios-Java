/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somawhile;

/* . Escreva um algoritmo que calcule a soma dos números de 1 a 15. Utilize o comando de repetição Enquanto
(While).*/
/**
 *
 * @author Alcid
 */
public class SomaWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i,soma;
        i = 1;
        soma = 0;
        while(i <= 15){
            soma = soma + i;
            i = i + 1;
        }
          System.out.println("A soma dos numeros de 1 a 15 é: " + soma);  
    }
    
}
