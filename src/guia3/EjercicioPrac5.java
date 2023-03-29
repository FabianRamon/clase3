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
public class EjercicioPrac5 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int valpos;
        int suma=0;
           
        System.out.println("Ingrese un valor limite");
        valpos = leer.nextInt();
        
       do {
           System.out.println("Ingrese un numero");
           num = leer.nextInt();
           suma += num;
       }while (suma<=valpos);
    }
    
}