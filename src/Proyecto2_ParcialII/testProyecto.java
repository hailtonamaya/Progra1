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
                    while (Menu==1 || Menu==2 || Menu==3 || Menu==4){
                        //MENU PRINCIPAL
                        Menu = menu.Principal();
                        if (Menu==1){
                            //
                        }else if (Menu==2){
                            //CONFIGURACION
                            char Opcion='a';
                            while (Opcion=='a' || Opcion=='b'){
                                Opcion = menu.Principal_Config();
                                if (Opcion=='a'){
                                    //DIFICULTAD
                                    System.out.println("Dificultad");
                                }else if (Opcion=='b'){
                                    //MODO DE JUEGO
                                    System.out.println("Modo");
                                }else{
                                    //REGRESAR AL MENU PRINCIPAL
                                }
                            }
                            
                        }else if (Menu==3){
                            //REPORTES
                            char Opcion='a';
                            while (Opcion=='a' || Opcion=='b'){
                                Opcion = menu.Principal_Reportes();
                                if (Opcion=='a'){
                                    //DESCRIPCION DE MIS ULTIMOS 10 JUEGOS
                                    System.out.println("Descripcion");
                                }else if (Opcion=='b'){
                                    //RANKING DE JUGADORES
                                    System.out.println("Ranking");
                                }else {
                                    //REGRESAR AL MENU PRINCIPAL
                                }
                            }
                            menu.Principal_Reportes();
                        }else if (Menu==4){
                            //MI PERFIL
                            char Opcion='a';
                            while (Opcion=='a' || Opcion=='b' || Opcion=='c'){
                                Opcion = menu.Principal_MiPerfil();
                                if (Opcion=='a'){
                                    //VER MIS DATOS
                                    System.out.println("Datos");
                                }else if (Opcion=='b'){
                                    //MODIFICAR MIS DATOS
                                    System.out.println("Modificar Datos");
                                }else if (Opcion=='c'){
                                    //ELIMINAR MI CUENTA
                                    System.out.println("Eliminar");
                                }else{
                                    //REGRESAR AL MENU PRINCIPAL
                                }
                            }
                        }
                    }
                } 
            }else if (Menu==2){
                estado = dtb.CrearJugador();
            }
        }
    }    
}

