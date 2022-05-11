/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hailton Amaya
 */
public class Amaya_Hailton_Cursos {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        Double TotalCiclo, PrecioAlumno,AsistenciaPor, AsistenciaAlum=0.0, PorAprobados=0.0, PorReprobados=0.0, AlumnosAprobados=0.0, AlumnosReprobados=0.0, TotalAlumnos=0.0;
        int DiaNum=0 , Mes=0, AlumnosCiclo=0;
        String Dia="", Examen="";
        
        System.out.println("Ingrese el dia(Día): ");
        Dia=leer.nextLine();
        System.out.println("Ingrese el dia(DD): ");
        DiaNum=leer.nextInt();
        System.out.println("Ingrese el mes(MM): ");
        Mes=leer.nextInt();
        
        if (DiaNum>31 || Mes>12){
            System.out.println("¡Usted ingreso un dia o mes invalido!");
        }
        
        if (Dia.equals("Lunes") || Dia.equals("lunes")){
            System.out.println("¿Se tomaron examenes ese dia? Ingrese Si/No");
            leer.nextLine();
            Examen=leer.nextLine();
            if (Examen.equals("Si")){
                System.out.println("Ingrese la cantidad de alumnos aprobados: ");
                AlumnosAprobados=leer.nextDouble();
                System.out.println("Ingrese la cantidad de alumnos reprobados: ");
                AlumnosReprobados=leer.nextDouble();
                TotalAlumnos=AlumnosAprobados+AlumnosReprobados;
                PorAprobados=100*(AlumnosAprobados/TotalAlumnos);
                PorReprobados=(AlumnosReprobados/TotalAlumnos)*100;
                System.out.println("El porcentaje de alumnos aprobados es: "+PorAprobados+"%");
                System.out.println("El procentaje de alumnos reprobados es: "+PorReprobados+"%");
            }else{
                System.out.println("No se tomo examenes");
            }
        }
        
        else if (Dia.equals("Martes") || Dia.equals("martes")){
            System.out.println("¿Se tomaron examenes ese dia? Ingrese Si/No");
            leer.nextLine();
            Examen=leer.nextLine();
            if (Examen.equals("Si")){
                System.out.println("Ingrese la cantidad de alumnos aprobados: ");
                AlumnosAprobados=leer.nextDouble();
                System.out.println("Ingrese la cantidad de alumnos reprobados: ");
                AlumnosReprobados=leer.nextDouble();
                TotalAlumnos=AlumnosAprobados+AlumnosReprobados;
                PorAprobados=100*(AlumnosAprobados/TotalAlumnos);
                PorReprobados=(AlumnosReprobados/TotalAlumnos)*100;
                System.out.println("El porcentaje de alumnos aprobados es: "+PorAprobados+"%");
                System.out.println("El procentaje de alumnos reprobados es: "+PorReprobados+"%");
            }else{
                System.out.println("No se tomo examenes");
            }
        }
         
        else if (Dia.equals("Miercoles") || Dia.equals("miercoles")){
            System.out.println("¿Se tomaron examenes ese dia? Ingrese Si/No");
            leer.nextLine();
            Examen=leer.nextLine();
            if (Examen.equals("Si")){
                System.out.println("Ingrese la cantidad de alumnos aprobados: ");
                AlumnosAprobados=leer.nextDouble();
                System.out.println("Ingrese la cantidad de alumnos reprobados: ");
                AlumnosReprobados=leer.nextDouble();
                TotalAlumnos=AlumnosAprobados+AlumnosReprobados;
                PorAprobados=100*(AlumnosAprobados/TotalAlumnos);
                PorReprobados=(AlumnosReprobados/TotalAlumnos)*100;
                System.out.println("El porcentaje de alumnos aprobados es: "+PorAprobados+"%");
                System.out.println("El procentaje de alumnos reprobados es: "+PorReprobados+"%");
            }else{
                System.out.println("No se tomo examenes");
            }
        }
          
        else if (Dia.equals("Jueves") || Dia.equals("jueves")){
              System.out.println("Ingrese la cantidad de alumnos que asistieron: ");
              AsistenciaAlum=leer.nextDouble();
              AsistenciaPor=(AsistenciaAlum/30)*100;
              if (AsistenciaPor>50){
                  System.out.println("Asistio la mayoria");
              }
              else{
                  System.out.println("No asistio la mayoria");
              }
        }
          
        else if (Dia.equals("Viernes") || Dia.equals("viernes")){
              if ((DiaNum==1 || DiaNum==01) && ((Mes==1 || Mes==01) || (Mes==7 || Mes==07))){
                  System.out.println("Comienzo nuevo ciclo");
                  System.out.println("Ingrese la cantidad de alumnos del nuevo ciclo: ");
                  AlumnosCiclo=leer.nextInt();
                  System.out.println("Ingrese el precio por cada alumno: ");
                  PrecioAlumno=leer.nextDouble();
                  TotalCiclo=PrecioAlumno*AlumnosCiclo;
                  System.out.println("El costo total del curso es: "+TotalCiclo+ " lps");
              }else {
                  System.out.println("No comienza nuevo ciclo");
              }
        }
        else{
            System.out.println("Usted ingreso un dia invalido");
        }
    }
}
