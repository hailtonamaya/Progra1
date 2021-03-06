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
        
        //Declarar Variables
        
        double Deposito=0, MargenGanancia=0, VentasAzucar=0, VentasAvena=0, VentasMaiz=0, VentasTrigo=0, MayorVenta=0, MayorCompra=0, PromedioCompra=0, PromedioVenta=0, VolumenCompra=0, VolumenVenta=0, TotalCompra=0, AzucarInv=0, AvenaInv=0, TrigoInv=0, MaizInv=0, TotalVentas=0, DescuentoSubtotal=0, Impuesto=0, Descuento=0, SubtotalVentas=0, DineroCaja=0, Productokg=0, Azucarkg=0, Avenakg=0, Trigokg=0, Maizkg=0, SubtotalAzucar=0, SubtotalAvena=0, SubtotalTrigo=0, SubtotalMaiz=0;
        int Caja=0, OpcionMenu=1, ContadorCompras=0, ContadorVentas=0;
        String OpcionComprarPro="Si", TipoCliente="", Espacio="", ProductoEstrella="";
        
        
        
        Scanner leer=new Scanner(System.in);
        
        //Se le presenta al usuario como utilizar el programa
        System.out.println("*******TIENDA*******");
        System.out.println("Instrucciones de uso: Para continuar presione la tecla Enter\n");
        leer.useDelimiter("\n");
        Espacio=leer.next();
            
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
                System.out.println("Su dinero en caja es: "+DineroCaja+" lps");
                Caja=1;
                leer.useDelimiter("\n");
                Espacio=leer.next();
                
            }else if (Caja==0 && OpcionMenu==2){
                System.out.println("La caja esta cerrada, no se pueden realizar ventas");
                leer.useDelimiter("\n");
                Espacio=leer.next();
            }else if(Caja==1 && OpcionMenu==2){
                while (OpcionComprarPro.equals("Si")){
                System.out.println("-------VENTAS-------");
                System.out.println("Ingrese el tipo de cliente A/B/C: ");
                leer.useDelimiter("\n");
                TipoCliente=leer.next();//El usuario ingresa que tipo de cliente es
                
                if (!"A".equals(TipoCliente) && !"B".equals(TipoCliente) && !"C".equals(TipoCliente) ){
                    System.out.println("Ingreso una opción incorrecta");//En caso de que el usuario ingrese un dato incorrecto
                }else {
                    System.out.println("1.- Azúcar-----Lps. 30.00");
                    System.out.println("2.- Avena------Lps. 25.00");
                    System.out.println("3.- Trigo------Lps. 32.00");
                    System.out.println("4.- Maíz-------Lps. 20.00");
                    System.out.println("Ingrese el número del producto que desea comprar: ");
                    int ProductoSelec=leer.nextInt();//El ususario ingresa el numero de producto que desea
                
                if (ProductoSelec!=1 && ProductoSelec!=2 && ProductoSelec!=3 && ProductoSelec!=4){
                         System.out.println("Ingreso una opción incorrecta");//En caso de que el usuario ingrese un dato incorrecto
                         leer.useDelimiter("\n");
                         Espacio=leer.next();
                }else {         
                    //Se evalua si el tipo de cliente puede adquirir el producto seleccionado
                    if (TipoCliente.equals("B") && ProductoSelec==4){
                        System.out.println("No puede adquirir ese producto");
                        leer.useDelimiter("\n");
                        Espacio=leer.next();
                    }else if (TipoCliente.equals("C") && (ProductoSelec==1 || ProductoSelec==2 || ProductoSelec==3)){
                        System.out.println("No puede adquirir ese producto");
                        leer.useDelimiter("\n");
                        Espacio=leer.next();
                    }else {
                        System.out.println("Ingrese cuantos kg desea del producto: ");
                        Productokg=leer.nextInt();//El ususario ingresa cuantos kg desea del producto
                    }
                    
                    
                    //Sumar las cantidades que el cliente va agregando y calcular precios de producto
                    if (ProductoSelec==1 && Productokg<=AzucarInv){
                        AzucarInv=AzucarInv-Productokg;
                        Azucarkg=Azucarkg+Productokg;
                        SubtotalAzucar=30*Azucarkg;
                        VentasAzucar=VentasAzucar+Productokg;
                    }else if (ProductoSelec==2 && Productokg<=AvenaInv){
                        AvenaInv=AvenaInv-Productokg;
                        Avenakg=Avenakg+Productokg;
                        SubtotalAvena=25*Avenakg;
                        VentasAvena=VentasAvena+Productokg;
                    }else if (ProductoSelec==3 && Productokg<=TrigoInv){
                        TrigoInv=TrigoInv-Productokg;
                        Trigokg=Trigokg+Productokg;
                        SubtotalTrigo=32*Trigokg;
                        VentasTrigo=VentasTrigo+Productokg;
                    }else if (ProductoSelec==4 && Productokg<=MaizInv){
                        MaizInv=MaizInv-Productokg;
                        Maizkg=Maizkg+Productokg;
                        SubtotalMaiz=20*Maizkg;
                        VentasMaiz=VentasMaiz+Productokg;
                    }else if (ProductoSelec==1 && Productokg>AzucarInv){
                        System.out.println("No hay inventario de este producto, solo tenemos "+AzucarInv+" kg de este producto");
                        leer.useDelimiter("\n");
                        Espacio=leer.next();
                    }else if (ProductoSelec==2 && Productokg>AvenaInv){
                        System.out.println("No hay inventario de este producto, solo tenemos "+AvenaInv+" kg de este producto");
                        leer.useDelimiter("\n");
                        Espacio=leer.next();
                    }else if (ProductoSelec==3 && Productokg>TrigoInv){
                        System.out.println("No hay inventario de este producto, solo tenemos "+TrigoInv+" kg de este producto");
                        leer.useDelimiter("\n");
                        Espacio=leer.next();
                    }else if (ProductoSelec==4 && Productokg>MaizInv){
                        System.out.println("No hay inventario de este producto, solo tenemos "+MaizInv+" kg de este producto");
                        leer.useDelimiter("\n");
                        Espacio=leer.next();
                    }
                    
                    //Calcular Subtotal e Impuesto
                    SubtotalVentas=SubtotalAzucar+SubtotalAvena+SubtotalTrigo+SubtotalMaiz;
                    Impuesto=SubtotalVentas*0.07;
                    
                    //Calcular si aplica descuento
                    if (SubtotalVentas>=1000 && SubtotalVentas<5000){
                        Descuento=SubtotalVentas*0.05;
                    }else if(SubtotalVentas>5000){
                        Descuento=SubtotalVentas*0.1;
                    }
                }
                    System.out.println("¿Desea comprar otro producto? Ingrese Si/No");
                    leer.nextLine();
                    OpcionComprarPro=leer.nextLine();//Se le pregunta al usuario si desea comprar otro producto
                    }
                
                    //En caso de que el usuario ingrese la opción en el formato incorrecto
                    if (!"Si".equals(OpcionComprarPro) && !"No".equals(OpcionComprarPro)){
                        System.out.println("Usted ingreso una opción inválida");
                        leer.useDelimiter("\n");
                        Espacio=leer.next();
                    }
                    
                    //Calcular Total de la venta
                    TotalVentas=(SubtotalVentas+Impuesto)-Descuento;
                }
                //Imprimir Facturación
                if (OpcionComprarPro.equals("No")){
                        System.out.println("\n-------FACTURACIÓN-------");
                        System.out.println("Azucar: ");
                        System.out.println("-Precio unitario: 30 lps");
                        System.out.println("-Cantidad en kg: "+Azucarkg);
                        System.out.println("Subtotal Azucar: "+SubtotalAzucar);
                        
                        System.out.println("\nAvena: ");
                        System.out.println("-Precio unitario: 25 lps");
                        System.out.println("-Cantidad en kg: "+Avenakg);
                        System.out.println("Subtotal Avena: "+SubtotalAvena);
                        
                        System.out.println("\nTrigo: ");
                        System.out.println("-Precio unitario: 32 lps");
                        System.out.println("-Cantidad en kg: "+Trigokg);
                        System.out.println("Subtotal Trigo: "+SubtotalTrigo);
                        
                        System.out.println("\nMaíz: ");
                        System.out.println("-Precio unitario: 20 lps");
                        System.out.println("-Cantidad en kg: "+Maizkg);
                        System.out.println("Subtotal Maíz: "+SubtotalMaiz);
                        
                        System.out.println("\nSubtotal: "+SubtotalVentas);
                        System.out.println("Impuesto: "+Impuesto);
                        System.out.println("Descuento: "+Descuento);
                        System.out.println("Total: "+TotalVentas+"\n");
                        leer.useDelimiter("\n");
                        Espacio=leer.next();
                }
                //Evaluar mayor venta
                if (TotalVentas>MayorVenta){
                    MayorVenta=TotalVentas;
                }
                
                //Evaluar producto mas vendido
                if (VentasAzucar>=VentasAvena && VentasAzucar>=VentasMaiz && VentasAzucar>=VentasTrigo){
                    ProductoEstrella="Azucar";
                }else if(VentasAvena>=VentasAzucar && VentasAvena>=VentasMaiz && VentasAvena>=VentasTrigo){
                    ProductoEstrella="Avena";
                }else if (VentasMaiz>=VentasAvena && VentasMaiz>=VentasAzucar && VentasMaiz>=VentasTrigo){
                    ProductoEstrella="Maiz";
                }else if (VentasTrigo>=VentasAvena && VentasTrigo>=VentasMaiz && VentasTrigo>=VentasAzucar){
                    ProductoEstrella="Trigo";
                }
                
                OpcionComprarPro="Si";
                //Sumar dinero a la caja
                DineroCaja=DineroCaja+TotalVentas;
                
                if (TotalVentas>0){
                    //Contar Ventas
                    ContadorVentas++;
                }
                
                //Sumar volumen de compras
                VolumenVenta=VolumenVenta+TotalVentas;
                PromedioVenta=VolumenVenta/ContadorVentas;
                
                //Se igualan los valores a 0 para que no se acumulen si se desea hacer otra compra
                SubtotalVentas=0;
                Descuento=0;
                TotalVentas=0;
                Impuesto=0;
                SubtotalAzucar=0; 
                SubtotalAvena=0;
                SubtotalTrigo=0;
                SubtotalMaiz=0;
                Azucarkg=0;
                Avenakg=0;
                Trigokg=0;
                Maizkg=0;
                
            }else if (Caja==0 && OpcionMenu==3){
                System.out.println("La caja esta cerrada, no se pueden realizar compras");
                leer.useDelimiter("\n");
                Espacio=leer.next();
            }else if (Caja==1 && OpcionMenu==3){
                TipoCliente="";
                System.out.println("-------COMPRAS-------");
                System.out.println("Ingrese el tipo de proveedor A/B/C: ");
                leer.useDelimiter("\n");
                TipoCliente=leer.next();//El usuario ingresa que tipo de proveedor es
                
                while (!"A".equals(TipoCliente) && !"B".equals(TipoCliente) && !"C".equals(TipoCliente) ){
                    System.out.println("Ingreso una opción incorrecta");//En caso de que el usuario ingrese un dato incorrecto
                    System.out.println("Ingrese el tipo de proveedor A/B/C: ");
                    leer.useDelimiter("\n");
                    TipoCliente=leer.next();
                }
                    System.out.println("1.- Azúcar-----Lps. 25.00");
                    System.out.println("2.- Avena------Lps. (B)20.00 (C)22.00");
                    System.out.println("3.- Trigo------Lps. 30.00");
                    System.out.println("4.- Maíz-------Lps. 18.00");
                    System.out.println("Ingrese el número del producto que desea comprar: ");
                    int ProductoSelec=leer.nextInt();//El ususario ingresa el numero de producto que desea
                
                     if (ProductoSelec!=1 && ProductoSelec!=2 && ProductoSelec!=3 && ProductoSelec!=4){
                         System.out.println("Ingreso una opción incorrecta");//En caso de que el usuario ingrese un dato incorrecto
                         leer.useDelimiter("\n");
                         Espacio=leer.next();
                     }else if(TipoCliente.equals("A") && (ProductoSelec==2 || ProductoSelec==3)){
                         System.out.println("Proveedor no vende dicho producto");
                         leer.useDelimiter("\n");
                         Espacio=leer.next();
                     }else if(TipoCliente.equals("B") && (ProductoSelec==1 || ProductoSelec==4)){
                         System.out.println("Proveedor no vende dicho producto");
                         leer.useDelimiter("\n");
                         Espacio=leer.next();
                     }else if(TipoCliente.equals("C") && (ProductoSelec==1 || ProductoSelec==3 || ProductoSelec==4)){
                         System.out.println("Proveedor no vende dicho producto");
                         leer.useDelimiter("\n");
                         Espacio=leer.next();
                     }else {
                         System.out.println("Ingrese la cantidad en kg que desea: ");
                         Productokg=leer.nextDouble();
                         //Calculos sobre el precio de la compra
                         if (ProductoSelec==1){
                             TotalCompra=Productokg*25;
                         }else if (ProductoSelec==2 && TipoCliente.equals("B")){
                             TotalCompra=Productokg*20;
                         }else if (ProductoSelec==2 && TipoCliente.equals("C")){
                             TotalCompra=Productokg*22;
                         }else if (ProductoSelec==3){
                             TotalCompra=Productokg*30;
                         }else if (ProductoSelec==4){
                             TotalCompra=Productokg*18;
                         }
                         //Calcular si hay suficiento dinero en caja para efectuar la compra
                        if (TotalCompra>DineroCaja){
                            System.out.println("No se puede pagar compra ");
                            TotalCompra=0;
                            leer.useDelimiter("\n");
                            Espacio=leer.next();
                        }else {
                            System.out.println("El total de su compra es: "+TotalCompra+" lps");
                            if (ProductoSelec==1){
                                AzucarInv=AzucarInv+Productokg;
                             }else if (ProductoSelec==2){
                                AvenaInv=AvenaInv+Productokg;
                             }else if (ProductoSelec==3){
                                TrigoInv=TrigoInv+Productokg;
                             }else if (ProductoSelec==4){
                                MaizInv=MaizInv+Productokg;
                             }
                            //Evaluar mayor compra
                            if (TotalCompra>MayorCompra){
                                MayorCompra=TotalCompra;
                            }
                         
                            //Contas cuantas compras se realizaron
                            ContadorCompras++;
                         
                            //Sumar dinero a caja
                            DineroCaja=DineroCaja-TotalCompra;
                         
                            //Sumar dinero a volumen de compra
                            VolumenCompra=VolumenCompra+TotalCompra;
                            PromedioCompra=VolumenCompra/ContadorCompras;
                            TotalCompra=0;
                         
                            leer.useDelimiter("\n");
                            Espacio=leer.next();
                        }
                     }
                
                
                
            }else if (OpcionMenu==4){
                //Imprimimr todos los reportes al usuario
                MargenGanancia=VolumenVenta-VolumenCompra;
                System.out.println("-------REPORTES-------");
                System.out.println("Cantidad en caja: "+DineroCaja+" lps");
                System.out.println("Ventas realizadas: "+ContadorVentas);
                System.out.println("Compras realizadas: "+ContadorCompras);
                System.out.println("Volumen total de Compras: "+VolumenCompra+" lps");
                System.out.println("Volumen total de Ventas: "+VolumenVenta+" lps");
                System.out.println("Margen de ganacia: "+MargenGanancia+" lps");
                System.out.println("Valor medio de Compra: "+PromedioCompra);
                System.out.println("Valor medio de Ventas: "+PromedioVenta);
                System.out.println("Compra con mayor gasto: "+MayorCompra+" lps");
                System.out.println("Venta con mayor ganancia: "+MayorVenta+" lps");
                System.out.println("Producto estrella: "+ProductoEstrella);
                System.out.println("");
                leer.useDelimiter("\n");
                Espacio=leer.next();
            }else if (OpcionMenu==5){
                System.out.println("-------CIERRE DE CAJA-------");
                System.out.println("Total ganacia en caja: "+DineroCaja);
                System.out.println("¿Cuanto dinero desea depositar al banco: ");
                Deposito=leer.nextDouble();
                
                //Evaluar si es mayor del 60%
                if (Deposito>(DineroCaja*0.6)){
                    System.out.println("No se puede depositar mas del 60% del dinero en caja");
                    leer.useDelimiter("\n");
                    Espacio=leer.next();
                }else {
                    DineroCaja=DineroCaja-Deposito;
                    System.out.println("El deposito se realizo exitosamente");
                    Caja=0;
                    leer.useDelimiter("\n");
                    Espacio=leer.next();
                }
                
                ContadorCompras=0;
                ContadorVentas=0;
                VolumenCompra=0;
                VolumenVenta=0;
                PromedioVenta=0;
                PromedioCompra=0;
                MayorCompra=0;
                MayorVenta=0;
                VentasAzucar=0;
                VentasMaiz=0;
                VentasTrigo=0;
                VentasAvena=0;
            }
            
            
        }
        if (OpcionMenu==6){
            //Mensaje cierre del sistema al usuario
            System.out.println("Se ha salido y cerrado el sistema");
        }
    }    
}