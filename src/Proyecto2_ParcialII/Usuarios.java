/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto2_ParcialII;

/**
 *
 * @author Hailton Amaya
 */
public class Usuarios {
    String Usuario, Contrasenia;
    int Puntos = 0;
    
    public String getUsuario(){
        return Usuario;
    } 
    public Usuarios(String Usuario, String Contrasenia){
        this.Usuario = Usuario;
        this.Contrasenia = Contrasenia;
        Puntos = 0;
    }
    
    public void imprimir(){
        System.out.println("Usuario: "+Usuario);
        System.out.println("Contraseña: "+Contrasenia);
        System.out.println("Puntos: "+Puntos);
    }
}
