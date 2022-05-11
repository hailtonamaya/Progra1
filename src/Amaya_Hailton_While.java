/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hailton Amaya
 */
public class Amaya_Hailton_While {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        String Resultado = "";
        int OpcionMenu=1, Contador=0, NumeroPares=0, TamañoCadena=0, Contador2=0, Suma2=0;
        double Numero=1, Suma=0, Promedio=0;
        
        
        while (OpcionMenu==1 || OpcionMenu==2){
            System.out.println("------OPCIONES DEL MENU------");
            System.out.println("1.- Ejercicio ciclo");
            System.out.println("2.- Ejercicio suma");
            System.out.println("3.- Terminar programa");
            System.out.println("Ingrese el numero de la opción que desea: ");
            OpcionMenu=leer.nextInt();
            
            if (OpcionMenu==1){
                while (Numero>0){
                    Suma=Suma+Numero;
                    Contador=Contador+1;
                    Promedio=Suma/Contador;
                    if (Numero%2==0){
                        NumeroPares=NumeroPares+1;
                    }
                    System.out.println("Ingrese un numero: ");
                    Numero=leer.nextDouble();
                }
                System.out.println("La suma de los valores es: "+Suma);
                System.out.println("La cantidad de valores ingresados fue: "+Contador);
                System.out.println("El promedio de los numeros ingresados es: "+Promedio);
                System.out.println("Se encontraron "+NumeroPares+" numeros pares");
            }else if (OpcionMenu==2){
                System.out.println("Ingrese un numero entero no negativo: ");
                
                String Numero2S="";
                int Numero2;
                int Caracter=0;
                leer.nextLine();
                Numero2S=leer.nextLine();
                Numero2 = Integer.parseInt(Numero2S);
                
                TamañoCadena=Numero2S.length();
                
                while (Contador2<TamañoCadena){
                    char Num=Numero2S.charAt(Contador2);
                    int Num2;
                    Num2 = Character.getNumericValue(Num);
                    
                    Suma2=Suma2+Num2;
                    Contador2=Contador2+1;
                    
                    if (Contador<TamañoCadena){
                       Resultado=Resultado+Num2+" + "; 
                    }else {
                       Resultado=Resultado+Num2; 
                    }
                    
                }
                Resultado=Resultado+" = "+Suma2;
                System.out.println("Resultado: "+Resultado);
                System.out.println("Suma: "+Suma2);
                
                
            }
        }
        
        if (OpcionMenu!=1 && OpcionMenu!=2 && OpcionMenu!=3){
            System.out.println("Usted ingreso un valor invalido");
        }
    }
}
