/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hailton Amaya
 */
public class Amaya_Hailton_Espacio {
    public static void main(String[] args) {
        String NombreCompleto = "", Carrera="";
        int Edad;
        
        Scanner leer=new Scanner(System.in);
        
        
        System.out.print("Ingrese su nombre completo: ");
        leer.useDelimiter("\\n");
        NombreCompleto=leer.next();
        System.out.print("Ingrese su edad: ");
        Edad=leer.nextInt();
        System.out.print("Carrera que estudia: ");
        leer.useDelimiter("\\n");
        Carrera=leer.next();
        
        System.out.println("-----Datos de la Persona-----");
        System.out.println("Nombre: "+NombreCompleto);
        System.out.println("Edad: "+Edad+" años");
        System.out.println("Carrera: "+Carrera);
        
    }
}
