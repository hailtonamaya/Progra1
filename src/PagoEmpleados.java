/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hailton Amaya
 */
public class PagoEmpleados {
    public static void main(String[] args) {
        String Nombre;
        Double PagoHorasNor, HorasExtra, PagoHorasEx, Subtotal, RAP, Total, HorasNorm, HorasTrabajadas;
        
        
        Scanner leer=new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        Nombre=leer.nextLine();
        System.out.print("Ingrese las horas trabajadas: ");
        HorasTrabajadas=leer.nextDouble();
        
        HorasExtra=0.0;
        if (HorasTrabajadas>40){
            HorasExtra=HorasTrabajadas-40;
        }
        
        HorasNorm=HorasTrabajadas-HorasExtra;
        PagoHorasNor=HorasNorm*150;
        PagoHorasEx=HorasExtra*250;
        
        Subtotal=PagoHorasNor+PagoHorasEx;
        RAP=Subtotal*0.035;
        Total=Subtotal-RAP;
        
        System.out.println("\n-----Pago-----");
        System.out.println("Nombre: "+Nombre);
        System.out.println("Pago Horas Normales: "+PagoHorasNor);
        System.out.println("Pago Horas Extra: "+PagoHorasEx);
        System.out.println("Subtotal: "+Subtotal);
        System.out.println("RAP: "+RAP);
        System.out.println("Total: "+Total);
    }
}
