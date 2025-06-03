
package programas;
import java.util.Scanner;

public class nombreparcial {

//Método principal
public static void main(String args[]) {
//Declaracion de variales
String empleado;
double ht, th, sb, d, sn, sa;//Version 2 se agrega variable sueldo anual
//creando el objeto lectura
Scanner lectura= new Scanner(System.in); 
//Entada de datos
System.out.print( "Nombre de empleado: ");
empleado=lectura.next();
System.out.print("Horas trabajadas: ");
ht=lectura.nextDouble();
System.out.print("Tarifa por hora: ");
th=lectura.nextDouble();

//Proceso de datos
sb=ht*th;
d=sb*0.13;
sn=sb-d;
sa=sn*12;//Version 2

//Salida de datos
System.out.println("Jornada laboral de: "+empleado);//Version 2
System.out.println("Sueldo bruto: "+sb);
System.out.println("Descuento: "+d);
System.out.println("Sueldo Neto: "+sn);
System.out.println("Sueldo Anual: "+sa);//Version 2


}
}

