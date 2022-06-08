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
public class Menus {
    Scanner lea = new Scanner(System.in);
    public int Inicio(){
        int Menu=1;
            System.out.println("\n-------MENU INICIO-------");
            System.out.println("1.- Login");
            System.out.println("2.- Crear Player");
            System.out.println("3.- Salir");
            Menu = lea.nextInt();
        return Menu;
    }
    public int Principal(){
        System.out.println("\n-------MENU PRINCIPAL-------");
        System.out.println("1.- Jugar Battleship");
        System.out.println("2.- Configuracion");
        System.out.println("3.- Reportes");
        System.out.println("4.- Mi Perfil");
        System.out.println("5.- Salir");
        int Menu = lea.nextInt();
        return Menu;
    }
    public char Principal_Config(){
        System.out.println("\n-------CONFIGURACION-------");
        System.out.println("a.- Dificultad");
        System.out.println("b.- Modo de Juego");
        System.out.println("c.- Regresar al Menu Principal");
        char Menu = lea.next().charAt(0);
        return Menu;
    }
    public char Principal_Reportes(){
        System.out.println("\n-------REPORTES-------");
        System.out.println("a.- Descripcion de mis ultimos 10 juegos");
        System.out.println("b.- Ranking de jugadores");
        System.out.println("c.- Regresar al Menu Prinicipal");
        char Menu = lea.next().charAt(0);
        return Menu;
    }
    public char Principal_MiPerfil(){
        System.out.println("\n-------MI PERFIL-------");
        System.out.println("a.- Ver mis Datos");
        System.out.println("b.- Modificar mis Datos");
        System.out.println("c.- Eliminar mis Datos");
        System.out.println("d.- Regresar al Menu Principal");
        char Menu = lea.next().charAt(0);
        return Menu;
    }
    public void IdentificarPrincipal(){
        
    }
}
