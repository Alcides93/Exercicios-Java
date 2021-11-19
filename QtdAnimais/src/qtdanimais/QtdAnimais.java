/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qtdanimais;

import java.util.Scanner;

/* . Uma loja de animais vende gatos e cachorros. Escreva um algoritmo que leia a quantidade de animais da loja
e, para cada animal, leia a informação do tipo do animal (se é gato ou cachorro). Ao final, exiba a
quantidade de animais que são gatos e a quantidade de animais que são cachorros existentes na loja */ 
/**
 *
 * @author Alcid
 */
public class QtdAnimais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Scanner tec = new Scanner(System.in);
        
        int qtdAnimais,i,totalG,totalC;
        String tipo;
        totalG = 0;
         totalC = 0;
        
        System.out.println("Digite a quantidade de animais na loja: ");
        qtdAnimais = tec.nextInt();
       
         for(i = 0; i <= qtdAnimais; i++){
             System.out.println("Digite o tipo do animal ( gato ou cachorro): ");
             tipo = tec.nextLine();
             
             if(tipo.equals("gato")){
                 totalG++;
             }else{
                 if(tipo.equals("cachorro")){
                     totalC++;
                 }
             }System.out.println("Total de gatos: " + totalG);
             System.out.println("Total de cachorros: " + totalC);
         }
        
    }
    
}
