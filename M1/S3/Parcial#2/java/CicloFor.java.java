import java.util.Scanner;
public class practica22 {
    public static void main(String[] args) {
        //nombre, especialidad, grupo y materia, ademas leer el numero de faltas durante el periodo en
        // la materia asignada.Si el numero de faltas es mayor a 3 que imprima un mensaje "el alumno no
        // tiene derecho a presentar examen".

        //Variables
        Scanner Leer = new Scanner(System.in);
        String nom, ap;
        int edad;
        Double est;
        //programa
        System.out.println("Ingresa tu nombre: ");
        nom = Leer.nextLine();
        System.out.println("Ingresa especialidad: ");
        ap = Leer.nextLine();
        System.out.println("Ingresa tu grupo: ");
        nom = Leer.nextLine();
        System.out.println("Ingresa tu materia: ");
        nom = Leer.nextLine();
        System.out.println("Ingresa numero de faltas: ");
         = Leer.nextInt();
        System.out.println("Ingresa edad: ");
        edad = Leer.nextInt();
        if (est >= 18) {
            System.out.println("Eres mayor de edad");
        }


    }
}