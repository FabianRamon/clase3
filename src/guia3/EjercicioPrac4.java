/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author wolve
 */
public class EjercicioPrac4 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una palabra o frase");
        frase = leer.nextLine();
        
        if(frase.substring(0,1).equalsIgnoreCase("A")){
            System.out.println("Correcto");
        }else {
            System.out.println("Inorrecto");
        }
        
    }
    
}
