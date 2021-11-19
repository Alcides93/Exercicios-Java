/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salariominimo;

import java.util.Scanner;

/**
 *
 * @author Alcid
 */
public class SalarioMinimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        double salario;
        
        System.out.println("Digite o valor do seu salário: ");
        salario = tec.nextDouble();
        
        if(salario <= 1100){
            System.out.println("Até 1 salário minimo");
        }else{
            if((salario > 1100) && (salario <= 3300)){
                System.out.println("Até 3 salários minimos");
            }else{
                if((salario > 3300) && (salario <= 5500)){
                    System.out.println("Até 5 salários minimos");
                }else{
                    if(salario > 5500){
                        System.out.println("Acima de 5 salários minimos");
                    }
                }
            }
        }
                
    }
    
}
