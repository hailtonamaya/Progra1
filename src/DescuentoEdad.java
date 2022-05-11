
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hailton Amaya
 */
public class DescuentoEdad {
    public static void main(String[] args) {
        
        int Edad;
        Double Subtotal, Descuento, DescuentoAplicado, SubtotalDes;
        
        
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese el subtotal de su compra: ");
        Subtotal=leer.nextDouble();
        System.out.println("Ingrese su edad: ");
        Edad=leer.nextInt();
        
        if (Edad>65){
        Descuento=0.40;
        DescuentoAplicado=Subtotal*Descuento;
        SubtotalDes=Subtotal-DescuentoAplicado;
    }
        else {
            Descuento=0.00;
            DescuentoAplicado=Subtotal*Descuento;
            SubtotalDes=Subtotal-DescuentoAplicado;
        }
        System.out.println("Su subtotal sin descuento es de: "+Subtotal);
        System.out.println("Usted tiene un descuento de: "+DescuentoAplicado);
        System.out.println("Su subtotal con descuento es de: "+SubtotalDes);
    }
}
