/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] estacionesTrabajo = new String[5];
        int[][] produccion = new int[5][12];
        double suma;
        double mayorProduccion = 0;
        int posicionMayor = 0;
        String mensaje = "";

        for (int fila = 0; fila < estacionesTrabajo.length; fila++) {
            suma = 0;
            System.out.printf("Ingrese el nombre de la estacion %d\n", fila + 1);
            estacionesTrabajo[fila] = entrada.nextLine();
            for (int col = 0; col < produccion[fila].length; col++) {
                System.out.printf("Ingrese la produccion del mes %d\n", col + 1);
                produccion[fila][col] = entrada.nextInt();
                entrada.nextLine();

                suma = suma + produccion[fila][col];
            }

            mensaje = String.format("%s%s Estacion %d - Total Produccion: $%.0f\n", mensaje, estacionesTrabajo[fila], fila + 1, suma);
            if (fila == 0 || suma > mayorProduccion) {
                mayorProduccion = suma;
                posicionMayor = fila;
            }
        }
        System.out.println("Analisis de Produccion");
        System.out.println("Estacion");
        System.out.println(mensaje);
        System.out.println("Estacion mas productiva: " + estacionesTrabajo[posicionMayor]);
        System.out.println("Encargado de la estacion: " + estacionesTrabajo[posicionMayor]);
        System.out.println("Cantidad de la estación más productiva: $ " + mayorProduccion);
    }
}
