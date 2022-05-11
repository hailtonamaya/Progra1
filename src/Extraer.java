/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hailton Amaya
 */
public class Extraer {
    public static void main(String[] args) {
        String numero="3455";
        int contador=0, suma=0;
        String record="";
        
        while (contador<numero.length()){
            char valor=numero.charAt(contador);
            int numeroInt = Integer.parseInt(valor+"");
            
            suma=suma+numeroInt;
            System.out.println(valor);
            if (contador<numero.length()){
                record=record+" + "+valor;
            }else{
                record=record+" = "+suma;
            }
            contador++;
        }
        System.out.println(record);
        
    }
}
