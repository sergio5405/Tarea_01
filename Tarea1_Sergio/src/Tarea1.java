import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Tarea 1");
        System.out.println("Sergio Alberto Hernandez Mendez");
        System.out.println("Matricula: A01371446\n");
        
        System.out.println("Teclea tu dia de nacimiento:");
        int dia = sc.nextInt();
        
        System.out.println("Teclea tu mes de nacimiento:");
        int mes = sc.nextInt();
        
        System.out.println("Teclea tu anio de nacimiento:");
        int anio = sc.nextInt();
        
        Fecha fechaNacimiento = new Fecha(dia, mes, anio);
        

        sc.nextLine();
        System.out.println("Teclea tu nombre:");
        String nombre = sc.nextLine();
        
        FrecuenciaCardiaca frecuencia = new FrecuenciaCardiaca(nombre, fechaNacimiento);
        
        System.out.println("Nombre: " + frecuencia.getNombre());
        System.out.println("Fecha de nacimiento: " + fechaNacimiento.toString());
        System.out.println("Edad: " + fechaNacimiento.calcularEdad());
        System.out.println("Frecuencia cardiaca maxima: " + frecuencia.getMaximaFrecuenciaCardiaca());
        System.out.printf("Frecuencia recomendada: [" + frecuencia.getMaximaFrecuenciaCardiaca()*.5 + ", ");
        System.out.println(frecuencia.getMaximaFrecuenciaCardiaca()*.85 + "]");     
        
    }
}
