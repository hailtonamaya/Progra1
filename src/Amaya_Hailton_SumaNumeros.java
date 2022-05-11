/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hailton Amaya
 */
import java.util.Scanner;
//el prgorama usa la clase Scanner.
public class Amaya_Hailton_SumaNumeros 
{
    //el metodo main empieza la ejecucion de la aplicación Java
    public static void main(String[] args) {
        int numero1;//primer número a sumar
        int numero2;// se agrego numero2 porque no se habia definido
        int suma;//suma de numero1 y numero2
        
        Scanner entrada= new Scanner(System.in);//Se agrego el scanner para leer datos
        System.out.print("Escriba el primer entero: ");//indicador
        numero1=entrada.nextInt();//lee el primer número del usuario/Se cambio el tipo a Int porque es un entero
        System.out.print("Escriba el segundo entero: ");//indicador
        numero2=entrada.nextInt();//lee el segundo número del ususario
        suma=numero1+numero2;//suma los números, después almacena el total en suma/Se cambio el * por + porque no es multiplicacion
        System.out.print("La suma es: "+suma);//muestra la suma/Se quito la , y se agrego el + a la salida para que funcione correctamente
    }//fin del metodo main
}//fin de la clase Suma
// se quito el ultimo corchete porque no era necesario