/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author Hailton Amaya
 */
public class Amaya_Hailton_ProyectoTienda {
    public static void main(String[] args) {
        
        double DineroCaja=0;
        int OpcionMenu=1;
        String OpcionComprarPro="Si", TipoCliente="";
        
        
        Scanner leer=new Scanner(System.in);
        
        while (OpcionMenu==1 || OpcionMenu==2 || OpcionMenu==3 || OpcionMenu==4 || OpcionMenu==5){
            //El usuario selecciona la opción del menú
            System.out.println("-------MENÚ-------");
            System.out.println("1.- Abrir caja");
            System.out.println("2.- Ventas");
            System.out.println("3.- Compras ");
            System.out.println("4.- Reportes");
            System.out.println("5.- Cierre de caja");
            System.out.println("6.- Salir del sistema");
            System.out.println("Ingrese el número de la opción que desea: ");
            OpcionMenu=leer.nextInt();
            
            if (OpcionMenu==1){
                System.out.println("-------ABRIR CAJA-------");
                System.out.println("Ingrese la cantidad de efectivo que desea guardar: ");
                double Efectivo=leer.nextDouble(); //El usuario ingresa lo que desea agregar a la caja
                DineroCaja=DineroCaja+Efectivo;
                
            }else if (OpcionMenu==2){
                while (OpcionComprarPro.equals("Si")){
                System.out.println("-------VENTAS-------");
                System.out.println("Ingrese el tipo de cliente A/B/C: ");
                //leer.nextLine();
                leer.useDelimiter("\n");
                TipoCliente=leer.next();//El usuario ingresa que tipo de cliente es
                
                if (!"A".equals(TipoCliente) && !"B".equals(TipoCliente) && !"C".equals(TipoCliente) ){
                    System.out.println("Ingreso una opción incorrecta");//En caso de que el usuario ingrese un dato incorrecto
                }else {
                    System.out.println("1.- Azúcar");
                    System.out.println("2.- Avena");
                    System.out.println("3.- Trigo");
                    System.out.println("4.- Maíz");
                    System.out.println("Ingrese el número del producto que desea comprar: ");
                    int ProductoSelec=leer.nextInt();//El ususario ingresa el numero de producto que desea
                
                
                    //Se evalua si el tipo de cliente puede adquirir el producto seleccionado
                    if (TipoCliente.equals("B") && ProductoSelec==4){
                        System.out.println("No puede adquirir ese producto");
                    }else if (TipoCliente.equals("C") && (ProductoSelec==1 || ProductoSelec==2 || ProductoSelec==3)){
                        System.out.println("No puede adquirir ese producto");
                    }else {
                        System.out.println("Ingrese cuantos kg desea del producto: ");
                        double ProductoKg=leer.nextInt();//El ususario ingresa cuantos kg desea del producto
                    }
                
                    System.out.println("¿Desea comprar otro producto? Ingrese Si/No");
                    leer.nextLine();
                    OpcionComprarPro=leer.nextLine();//Se le pregunta al usuario si desea comprar otro producto
                    }
                    //En caso de que el usuario ingrese la opción en el formato incorrecto
                    if (!"Si".equals(OpcionComprarPro) && !"No".equals(OpcionComprarPro)){
                        System.out.println("Usted ingreso una opción inválida");
                    }
              }
                System.out.println("-------FACTURACIÓN-------");
                        System.out.println("Tipo de Cliente: "+TipoCliente);
                        System.out.println("Azucar: ");
                        System.out.println("-Precio unitario: 30 lps");
                        System.out.println("-Cantidad en kg: ");
                        System.out.println("Avena: ");
                        System.out.println("-Precio unitario: 25 lps");
                        System.out.println("-Cantidad en kg: ");
                        System.out.println("Trigo: ");
                        System.out.println("-Precio unitario: 32 lps");
                        System.out.println("-Cantidad en kg: ");
                        System.out.println("Maíz: ");
                        System.out.println("-Precio unitario: 20 lps");
                        System.out.println("-Cantidad en kg: ");
            }
            
            
        }
        if (OpcionMenu==6){
            //Mensaje cierre del sistema al usuario
            System.out.println("Se ha salido y cerrado el sistema");
        }
    }    
}
