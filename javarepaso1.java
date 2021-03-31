
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author electro
 */
public class javarepaso1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner teclado = new Scanner(System.in); 
        System.out.println("precio por hora");
        System.out.println("precio de las horas hechas en un mes");
        
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int sueldomensual = a*b;
        int sueldoanual = sueldomensual*12;
        
        System.out.println("sueldo mensual: " +sueldomensual);
        System.out.println("sueldo anual: " +sueldoanual);
    }
    
}
