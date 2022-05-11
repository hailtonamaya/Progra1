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
public class EjercicioDoWhile {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double numero=0, numero2=0, suma=0, suma2=0;
        boolean estado=true;
        while (estado){
            suma=suma+numero;
            System.out.println("Ingrese un numero: ");
            numero=leer.nextDouble();
            if (numero<0){
                estado = false;
            }
            
        }
        System.out.println("Suma: "+suma);
        
        estado=true;
        do {
            suma2=suma2+numero2;
            System.out.println("Ingrese un numero: ");
            numero2=leer.nextDouble();
            if (numero2<0){
                estado = false;
            }
        }while (estado);
        System.out.println("Suma: "+suma2);    
         
    }
}
