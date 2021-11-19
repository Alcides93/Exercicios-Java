/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compararaostring;

/**
 *
 * @author Alcid
 */
public class CompararaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Alcides";
        String nome2 = "Alcides";
        String nome3 = new String("Alcides");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
        
    }
    
}
