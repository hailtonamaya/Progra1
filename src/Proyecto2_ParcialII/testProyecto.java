/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto2_ParcialII;
import java.util.Scanner;

/**
 *
 * @author Hailton Amaya
 */
public class testProyecto {
    public static void main(String[] args) {
        Menus menu = new Menus();
        Scanner lea = new Scanner(System.in);
        Database dtb = new Database();
        int Menu = 1;
        boolean estado;
        
        while (Menu==1 || Menu==2){
            Menu = menu.Inicio();
            if (Menu==1){
                estado = dtb.IniciarSesion();
                if (estado == true){
                    Menu = menu.Principal();
                }
            }else if (Menu==2){
                estado = dtb.CrearJugador();
            }
        }
        
    }    
}

