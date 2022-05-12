/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajosClase;

import java.util.Scanner;

/**
 *
 * @author Hailton Amaya
 */
public class EjercicioFor {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String Palabra="";
        int vocales=0;
        
        System.out.println("Ingrese la palabra: ");
        Palabra=leer.nextLine();
        
        for(int letra=0;letra<Palabra.length();letra++){
            System.out.println(Palabra.charAt(letra));
            if (Palabra.charAt(letra)=='a' || Palabra.charAt(letra)=='e' ||Palabra.charAt(letra)=='i' || Palabra.charAt(letra)=='o' || Palabra.charAt(letra)=='u' ){
                vocales++;
            }
        }
        System.out.println("La palabra contiene "+vocales+" vocales");
        
    }
}
