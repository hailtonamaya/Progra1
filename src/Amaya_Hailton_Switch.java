/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hailton Amaya
 */
public class Amaya_Hailton_Switch {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        /*
        La principal diferencia entre if y switch, es que al utilizar un if
        se debe agregar una nueva sentencia por cada caso, mientras que en el
        switch, los casos se van agregando directamente. Otra diferencia es
        que el if comprueba si es verdadera o falsa la condición, y el switch
        solamente compara los diferentes escenarios.
        */
        
        
        //FORMA 1
        int Numero;
        System.out.println("-------FORMA 1-------");
        System.out.println("1.- Lunes\n2.-Martes\n3.- Miercoles\n4.- Jueves\n5.- Viernes\n6.- Sabado\n7.- Domingo");
        System.out.println("Ingrese el numero del dia de la semana que desea: ");
        Numero=leer.nextInt();
        
        switch (Numero){
            case 1: System.out.println("Usted selecciono el dia Lunes");
            break;
            case 2: System.out.println("Usted selecciono el dia Martes");
            break;
            case 3: System.out.println("Usted selecciono el dia Miercoles");
            break;
            case 4: System.out.println("Usted selecciono el dia Jueves");
            break;
            case 5: System.out.println("Usted selecciono el dia Viernes");
            break;
            case 6: System.out.println("Usted selecciono el dia Sabado");
            break;
            case 7: System.out.println("Usted selecciono el dia Domingo");
            break;
            default:
                System.out.println("Ingreso un numero invalido");
                
        }
        
        
        //FORMA 2
        int Clase;
        System.out.println("-------FORMA 2-------");
        System.out.println("1.- Algebra\n2.- Programacion I\n3.- Historia de Honduras\n4.- Filosofia");
        System.out.println("Ingrese el numero de la clase que desea matricular: ");
        Clase=leer.nextInt();
        
        switch(Clase){
            case 1: System.out.println("Se ha matriculado Algebra existosamente");
            break;
            case 2: System.out.println("Se ha matriculado Programacion I existosamente");
            break;
            case 3: System.out.println("Se ha matriculado Historia de Honduras existosamente");
            break;
            case 4: System.out.println("Se ha matriculado Filosofia existosamente");
            break;
            default:
                System.out.println("Ingreso un numero invalido");
            
        }
    }
    
}
