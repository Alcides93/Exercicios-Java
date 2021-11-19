/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trocadevalores;

import java.util.Scanner;

/**
 *
 * @author Alcid
 */
public class TrocaDeValores {

/* Escrever uma programa em que leia dois valores para as variáveis A e B, e
efetuar as trocas dos valores de forma que a variável A passe a possuir o valor
da variável B e a variável B passe a possuir o valor da variável A. Apresentar
os valores trocados.
Lembrando que temos que ter 3 variáveis para que uma haja como variável
de armazenamento, ou seja, para evitar que o valor original de a se perca é
necessário associar a uma outra variável (denominada usualmente de
variável auxiliar) tal valor, estabelecer uma associação de a com o valor em b
e, por último, associar b ao valor "salvo" na variável auxiliar. 
*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        int a,b,c;
        
        System.out.println("Digite o valor de A: ");
        a  = tec.nextInt();
        
        System.out.println("Digite o valor de B: ");
        b = tec.nextInt();
        
        c = a;
        a = b;
        b = c;
        
        System.out.println("O valor de A é: " + a);
        System.out.println("O valor de B é: " + b);
        
        
    }
    
}
