/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imprimirrecibotienda;

import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author Juan Chamizo
 */
public class ImprimirReciboTienda {


    public static void main(String[] args) {
        double[] ventas = new double[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el monto de la venta "+ (i+1) + " : ");    
            ventas[i] = scanner.nextDouble();
            
        }

        // Algoritmo de ordenamiento de burbuja
        for (int i = 0; i < ventas.length - 1; i++) {
            for (int j = 0; j < ventas.length - i - 1; j++) {
                if (ventas[j] <ventas[j + 1]) {
           //Intercambio de elementos
                    double temp = ventas[j];
                    ventas[j] = ventas[j + 1];
                    ventas[j + 1] = temp;
                }
            }
        }

String reporteVentas = "Reporte de ventas:\n";
for (double venta : ventas) {
    reporteVentas += venta + "\n";
}

        System.out.println(reporteVentas);
        }
}

