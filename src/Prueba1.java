/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hailton Amaya
 */
public class Prueba1 {
    public static void main(String[] args) {
        String Nombre="", Nombre2="";
        Scanner leer=new Scanner(System.in);
        System.out.println("Nombre: ");
        //leer.useDelimiter("\n");
        Nombre=leer.nextLine();
        System.out.println(Nombre);
        System.out.println("Nombre: ");
        //leer.useDelimiter("\n");
        Nombre2=leer.next();
        System.out.println(Nombre2);
    }
}
