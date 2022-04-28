/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutable05 {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        entry.useLocale(Locale.US);

        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        Hospital h3 = new Hospital();

        System.out.println("Ingrese el nombre del hospital 1");
        String valor1 = entry.nextLine();
        h1.establecerNombre(valor1);

        System.out.println("Ingrese el número de camas del hospital 1");
        int valor2 = entry.nextInt();
        h1.establecerNumeroCamas(valor2);

        System.out.println("Ingrese el monto del presupuesto del hospital 1");
        double valor3 = entry.nextInt();
        h1.establecerPresupuesto(valor3);

        entry.nextLine();

        System.out.println("Ingrese el nombre del hospital 2");
        valor1 = entry.nextLine();
        h2.establecerNombre(valor1);

        System.out.println("Ingrese el número de camas del hospital 2");
        valor2 = entry.nextInt();
        h2.establecerNumeroCamas(valor2);

        System.out.println("Ingrese el monto del presupuesto del hospital 2");
        valor3 = entry.nextInt();
        h2.establecerPresupuesto(valor3);

        entry.nextLine();

        System.out.println("Ingrese el monto del presupuesto del hospital 3");
        valor1 = entry.nextLine();
        h3.establecerNombre(valor1);

        System.out.println("Ingrese el número de camas del hospital 3");
        valor2 = entry.nextInt();
        h3.establecerNumeroCamas(valor2);

        System.out.println("Ingrese el monto del presupuesto del hospital 3");
        valor3 = entry.nextInt();
        h3.establecerPresupuesto(valor3);

        double suma = h1.obtenerPresupuesto() + h2.obtenerPresupuesto()
                + h3.obtenerPresupuesto();

        int suma2 = h1.obtenerNumeroCamas()
                + h2.obtenerNumeroCamas() + h3.obtenerNumeroCamas();

        System.out.printf("\nLa suma de presupuestos es %.2f\nLa suma de camas es"
                + " %d\n\n", suma, suma2);
        
        System.out.println("Los hospitales ingresados fueron:");
        System.out.printf("%s - %d - %.2f\n", h1.obtenerNombre(), 
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        System.out.printf("%s - %d - %.2f\n", h2.obtenerNombre(), 
                h2.obtenerNumeroCamas(), h2.obtenerPresupuesto());
        System.out.printf("%s - %d - %.2f\n", h3.obtenerNombre(), 
                h3.obtenerNumeroCamas(), h3.obtenerPresupuesto());

        
        
    }
}
