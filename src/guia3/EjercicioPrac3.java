package guia3;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wolve
 */
public class EjercicioPrac3 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una palabra o frase");
        frase = leer.nextLine();
        
        if(frase.length()== 8){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
        
    }
    
}

