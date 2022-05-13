/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hailton Amaya
 */
public class Amaya_Hailton_Prueba1 {
    public static void main(String[] args) {
        
        
        Scanner leer=new Scanner(System.in);
        
        //Declaración variables
        int ContadorVotaciones=0, ContadorPalabraAlreves=0, ContadorMayorMenor=0, ContadorPalindroma=0, MenuSelec=1, ContadorPalabra=0, letra=0, vocales=0, CantidadNumero=0, ContadorNulo=0, ContadorNumero=0, ContadorAzul=0, ContadorRojo=0, ContadorNegro=0, ContadorAmarillo=0, ContadorVotantes=0;
        double Numero=0, Evaluacion=0, MayorNumero=0, MenorNumero=100000000, EvaluacionMayor=0, EvaluacionMenor=0;
        String PlanillaGanadora="", Palabra="", PalabraAlreves="";
        
        while(MenuSelec==1 || MenuSelec==2 || MenuSelec==3 || MenuSelec==4){
            //Se le muestran las opciones al usuario
            System.out.println("1.- Palabra Alreves");
            System.out.println("2.- Palíndroma & Vocal");
            System.out.println("3.- Mayor y Menos Ingresados");
            System.out.println("4.- Votaciones");
            System.out.println("5.- Salir");
            System.out.println("Ingrese el numero de la opción que desea: ");//Usuario ingresa la opción que desea
            MenuSelec=leer.nextInt();
            
            if (MenuSelec==1){
                System.out.println("******PALABRA ALREVES******");
                System.out.println("Ingrese la palabra que desee: ");
                leer.useDelimiter("\n");
                Palabra=leer.next();
                
                //Sacar palabras Alreves
                for (letra=Palabra.length()-1;letra>=0;letra--){
                    PalabraAlreves+=Palabra.charAt(letra);
                }
                System.out.println("La palabra Alreves es: "+PalabraAlreves);
                PalabraAlreves="";
                letra=0;
                ContadorPalabraAlreves++;

            }else if (MenuSelec==2){
                System.out.println("******PALINDROMA & VOCAL******");
                System.out.println("Ingrese la palabra que desea: ");
                leer.useDelimiter("\n");
                Palabra=leer.next();//Usuario ingresa la palabra
                
                //Convertir a minuscula para hacer la comparacion
                Palabra=Palabra.toLowerCase();
                
                //Escribirla al reves y comparar si son iguales
                for (letra=Palabra.length()-1;letra>=0;letra--){
                    PalabraAlreves+=Palabra.charAt(letra);
                }
                if (PalabraAlreves.equals(Palabra)){
                    System.out.println("La palabra si es palindroma");
                }else {
                    System.out.println("La palabra no es palindroma");
                }
                
                //evaluar si la palabra tiene vocales
                for(letra=0;letra<Palabra.length();letra++){
                    if (Palabra.charAt(letra)=='a' || Palabra.charAt(letra)=='e' ||Palabra.charAt(letra)=='i' || Palabra.charAt(letra)=='o' || Palabra.charAt(letra)=='u' ){
                    vocales++;
                    }
                }
                System.out.println("La palabra contiene "+vocales+" vocales");
                PalabraAlreves="";
                letra=0;
                ContadorPalindroma++;
            }else if (MenuSelec==3){
                System.out.println("******MAYOR Y MENOR INGRESADOS******");
                System.out.println("Ingrese la cantidad de numeros que desea ingresar: ");
                CantidadNumero=leer.nextInt();//usuario ingresa cuantos numero desea ingresar
                
                //Se solicitan la cantidad de numero que el usuario ingreso
                while (ContadorNumero<CantidadNumero){
                    ContadorNumero++;
                    Evaluacion=Numero;
                    
                    System.out.println("Ingrese numero "+ContadorNumero);
                    Numero=leer.nextDouble();
                    
                    //Sacar numero mayor
                    if (Numero>=MayorNumero){
                        MayorNumero=Numero;
                        EvaluacionMayor=Numero;
                    }
                    if(Numero>=EvaluacionMayor){
                        MayorNumero=Numero;
                    }
                    
                    //Sacar numero menor
                    if (Numero<=MenorNumero){
                        MenorNumero=Numero;
                        EvaluacionMenor=Numero;
                    }
                    if (Numero<=EvaluacionMenor){
                        MenorNumero=Numero;
                    }
                }
                System.out.println("El numero mayor es: "+MayorNumero);
                System.out.println("El numero menor es: "+MenorNumero);
                ContadorNumero=0;
                MayorNumero=0;
                MenorNumero=0;
                Numero=0;
                ContadorMayorMenor++;
            }else if(MenuSelec==4){
                System.out.println("******VOTACIONES******");
                System.out.println("Ingrese cuantos votantes hay en el país: ");
                int Votantes=leer.nextInt();//usuario ingresa cuantos votantes hay
                
                //se repite el ciclo dependiendo la cantidad de votantes
                while (Votantes>ContadorVotantes){
                    ContadorVotantes++;
                    System.out.println("PLANILLAS");
                    System.out.println("1.- AZUL");
                    System.out.println("2.- ROJO");
                    System.out.println("3.- NEGRO");
                    System.out.println("4.- AMARILLO");
                    System.out.println("Ingrese el numero de la planilla que votara: ");
                    int Planilla=leer.nextInt();
                    
                    //Evaluar si el voto es nulo o se aplico a una de las planillas
                    if (Planilla!=1 && Planilla!=2 && Planilla!=3 && Planilla!=4){
                        System.out.println("Voto Nulo");
                        ContadorNulo++;
                    }else if(Planilla==1){
                        System.out.println("Voto registrado en planilla AZUL");
                        ContadorAzul++;
                    }else if(Planilla==2){
                        System.out.println("Voto registrado en planilla ROJO");
                        ContadorRojo++;
                    }else if(Planilla==3){
                        System.out.println("Voto registrado en planilla NEGRO");
                        ContadorNegro++;
                    }else if(Planilla==4){
                        System.out.println("Voto registrado en planilla AMARILLO");
                        ContadorAmarillo++;
                    }
                }
                //Sacar planilla ganadora
                if (ContadorAzul>=ContadorRojo && ContadorAzul>=ContadorNegro && ContadorAzul>=ContadorAmarillo){
                    PlanillaGanadora="AZUL";
                } else if (ContadorRojo>=ContadorAzul && ContadorRojo>=ContadorNegro && ContadorRojo>=ContadorAmarillo){
                    PlanillaGanadora="ROJO";
                } else if (ContadorNegro>=ContadorRojo && ContadorNegro>=ContadorAzul && ContadorNegro>=ContadorAmarillo){
                    PlanillaGanadora="NEGRO";
                } else if (ContadorAmarillo>=ContadorRojo && ContadorAmarillo>=ContadorNegro && ContadorAmarillo>=ContadorAzul){
                    PlanillaGanadora="AMARILLO";
                }
                double VotosValidos=ContadorAzul+ContadorRojo+ContadorNegro+ContadorAmarillo;
                double PorVotosValidos=(VotosValidos/Votantes)*100;
                if (PorVotosValidos>=60){
                    System.out.println("La planilla ganadora fue: "+PlanillaGanadora);
                }else {
                    System.out.println("VOTACION FALLIDA");
                }
                PlanillaGanadora="";
                ContadorAzul=0;
                ContadorNegro=0;
                ContadorRojo=0;
                ContadorAmarillo=0;
                ContadorNulo=0;
                ContadorVotantes=0;
                PorVotosValidos=0;
                VotosValidos=0;
                ContadorVotaciones++;
            }else if(MenuSelec==5){
                //Imprimir cuantas veces se ingreso a cada parte del menu
                System.out.println("Se ingreso "+ContadorPalabraAlreves+" veces a PALABRA ALREVES");
                System.out.println("Se ingreso "+ContadorPalindroma+" veces a PALINDROMA & VOCAL");
                System.out.println("Se ingreso "+ContadorMayorMenor+" veces a MAYOR Y MENOR INGRESADOS");
                System.out.println("Se ingreso "+ContadorVotaciones+" veces a VOTACIONES");
            }
        }
    }
}
