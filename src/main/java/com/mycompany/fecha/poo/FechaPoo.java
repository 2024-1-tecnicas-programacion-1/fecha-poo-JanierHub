package com.mycompany.fecha.poo;
import java.util.Scanner;

public class FechaPoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los datos de la fecha
        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el año: ");
        int year = scanner.nextInt(); 
        
        Fecha fecha1 = new Fecha(dia, mes, year);
       
        if (fecha1.validarFecha()) {
            System.out.println("La fecha es válida.");
            
            System.out.println("Fecha larga: " + fecha1.fechaLarga());
        } else {
            System.out.println("La fecha no es válida.");
        }

        scanner.close();
    }
}


