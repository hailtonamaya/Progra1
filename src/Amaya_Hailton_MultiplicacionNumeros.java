/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
//el programa usa la clase scanner
/**
 *
 * @author Hailton Amaya
 */
public class Amaya_Hailton_MultiplicacionNumeros {
    //empiza la ejecución de la aplicacion en Java
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);//objeto scanner que leera las entradas
        int valorx, valory, valorz, resultado;//variables a utilizar en el programa
        System.out.println("Ingrese el primer entero: ");//indicador
        valorx=entrada.nextInt();//leer primer numero del usuario
        System.out.println("Ingrese el segundo entero: ");//indicador
        valory=entrada.nextInt();//leer segundo numero del ususario
        System.out.println("Ingrese el tercer entero: ");//indicador
        valorz=entrada.nextInt();//leer tercer numero del usuario
        resultado=valorx*valory*valorz;//se calcula el producto de los tres enteros
        System.out.println("El producto es: "+resultado);//se muestra el resultado
    }
    
}
