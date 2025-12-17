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
        int[] produccion = new int[12];
        double suma;

        for (int fila = 0; fila < estacionesTrabajo.length; fila++) {
            suma = 0;
            System.out.printf("Ingrese el nombre de la estacion");
            estacionesTrabajo[fila] = entrada.nextLine();
            for (int col = 0; col < estacionesTrabajo.length; col++){
                System.out.printf("Ingrese la produccion del mes");
                produccion[fila] = entrada.nextInt();

		suma = suma + produccion[fila];
            }
        }
    }
}
