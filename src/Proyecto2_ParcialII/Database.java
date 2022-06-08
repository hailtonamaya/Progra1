/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto2_ParcialII;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hailton Amaya
 */
public class Database {
    String Usuario, Contrasenia;
    Usuarios CurrentUser;
    Scanner lea = new Scanner(System.in);
    ArrayList<Usuarios> User = new ArrayList();
    

    public Usuarios searchUser(String Usuario){
        for (int i = 0; i < User.size(); i++){
            if (User.get(i).Usuario.equals(Usuario)){
                return User.get(i);
            }
        }
        return null;
    }
    
    public boolean AgregarUsuario(String Usuario, String Contrasenia){
        if (searchUser(Usuario)==null){
            Usuarios Jugador = new Usuarios(Usuario, Contrasenia); 
            User.add(Jugador);
            return true;
        }
        return false;
    }
    
    public Usuarios searchPlayer(String Usuario, String Contrasenia){
        for (int i = 0; i<User.size(); i++){
            if (User.get(i).Usuario.equals(Usuario) && User.get(i).Contrasenia.equals(Contrasenia)){
                return User.get(i);
            }
        }
        return null;
    }
    
    public boolean ValidarUsuario (String Usuario, String Contrasenia){
        if (searchPlayer(Usuario, Contrasenia)!=null){
            return true;
        }
        return false;
    }
    
    public boolean IniciarSesion(){
        System.out.println("-------INICIO DE SESIÓN-------");
        System.out.println("Ingrese su usuario: ");
        lea.useDelimiter("\n");
        Usuario = lea.next();
        System.out.println("Ingrese su contraseña: ");
        lea.useDelimiter("\n");
        Contrasenia = lea.next();
        boolean estado = ValidarUsuario(Usuario, Contrasenia);
        if (estado == true){
            System.out.println("Se inicio sesion\n");
            return true;
        }else if (estado == false){
            System.out.println("El usuario no existe o las credenciales son incorrectas");
        }
        return false;
    }
    
    public boolean CrearJugador(){
        System.out.println("-------CREAR JUGADOR-------");
        System.out.println("Ingrese el nuevo usuario: ");
        lea.useDelimiter("\n");
        Usuario = lea.next();
        System.out.println("Ingrese una nueva contraseña: ");
        lea.useDelimiter("\n");
        Contrasenia = lea.next();
        boolean estado = AgregarUsuario(Usuario, Contrasenia);
        if (estado == true){
            System.out.println("Se agrego exitosamente");
            return true;
        }else if (estado == false){
            System.out.println("El usuario ya existe, no se pudo agregar");
        }
        return false;
    }
    
    public void Jugadores(){
        for (Usuarios jt:User){
            if(jt!=null){
                jt.imprimir();
            }
        }
    }
}
