/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reajustesalario;
// Crie um algoritmo que lê o salário de um funcionário, reajusta o salário em 7% e mostra o resultado.

import java.util.Scanner;

/**
 *
 * @author Alcid
 */
public class ReajusteSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
         double salario,reajuste,novoSalario;
         
         System.out.println("Digite o seu salário atual: ");
         salario = tec.nextDouble();
         reajuste = salario * 0.07;
         novoSalario = salario + reajuste;
         
         System.out.println("O novo salário reajustado é: " + novoSalario);
    }
    
}
