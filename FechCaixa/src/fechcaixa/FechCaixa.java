/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fechcaixa;

import java.util.Scanner;

/* Crie um algoritmo que simule o funcionamento de um caixa de supermercado. O caixa fica aberto até o fim
do expediente e pode processar a compra de vários clientes. Cada cliente pode comprar vários itens. Ao ler
cada item deve ser exibida uma mensagem para o operador do caixa perguntando se há mais itens a serem
processados. Ao final, exiba quanto a compra custou ao cliente. E então solicite do operador do caixa a
informação se deseja fechar o caixa. Encerre o algoritmo quando o usuário informar que deseja fechar o caixa.*/
/**
 *
 * @author Alcid
 */
public class FechCaixa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        
        int qtdProdutos;
        double precoProduto, precoTotal;
        String novaCompra,novoProduto;
        precoTotal = 0;
        
        System.out.println("Iniciar nova compra? Sim ou Não? ");
        novaCompra = tec.nextLine();
        
        while(novaCompra.equals("sim")){
            precoTotal = 0;
            System.out.println("Digitar novo produto? Sim ou Não? ");
        novoProduto = tec.nextLine();
        
        while(novoProduto.equals("sim")){
            System.out.println("digite o preço do produto: ");
            precoProduto = tec.nextDouble();
            precoTotal = precoTotal + precoProduto;
            
            System.out.println("Digitar novo produto? Sim ou Não? ");
            novoProduto = tec.nextLine();
            
        }   System.out.println("O preço total dessa compra é: " + precoTotal);
            System.out.println("Iniciar nova compra? Sim ou Não? ");
        novaCompra = tec.nextLine();
        
    }
    }
}
    

