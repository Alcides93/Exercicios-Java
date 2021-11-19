/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dadosusuario;

import java.util.Scanner;

/* Crie um algoritmo que solicite o nome, o endereço e o telefone do usuário e depois mostra os dados digitados
em uma única linha. */
/**
 *
 * @author Alcid
 */
public class DadosUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        String nome,endereco,telefone;
        
        System.out.println("Digite seu nome: ");
        nome = tec.nextLine();
        System.out.println("Digite seu endereço: ");
        endereco = tec.nextLine();
        System.out.println("Digite seu numero de telefone: ");
        telefone = tec.nextLine();
        
        System.out.println("Nome: " + nome +  " / Enderenço: " + endereco + " /Telefone " + telefone);
    }
    
}
