/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hailton Amaya
 */
public class TestAnidada {
    public static void main(String[] args) {
        //Declarar Variables
        Double Nota1, Nota2, Nota3, Promedio;
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese la nota 1: ");
        Nota1=leer.nextDouble();
        System.out.println("Ingrese la nota 2: ");
        Nota2=leer.nextDouble();
        System.out.println("Ingrese la nota 3: ");
        Nota3=leer.nextDouble();
        
        Promedio=(Nota1+Nota2+Nota3)/3;
        
        System.out.println("Promedio: "+Promedio);
        
        /*
        Promedio es:
        -menor que 60 sera insuficiente
        -Mayor e igual que 60 entre 85 sera notable
        -mayor e igual que 85 entre 100 sera excelente
        */
        
        if (Promedio>=0 && Promedio<60){
            System.out.println("Su promedio es insuficiente");
        }
        else if (Promedio>=60 && Promedio<85){
            System.out.println("Su Promedio es notable");
        }
        else if (Promedio>=85 && Promedio<=100){
            System.out.println("Su Promedio es excelente");
        }
        else {
            System.out.println("Su Promedio es invalido");
        }
        
    }
   
}
