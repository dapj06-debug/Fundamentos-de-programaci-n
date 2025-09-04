/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego Pulig
 */
import java.util.Arrays;

public class Programa2_Busqueda2DJava {
    
    public static void main(String[] args) {
        
    int [][] matriz = {
        {9,3,6},
        {8,4,12},
        {15,10,5}
    };
    
         System.out.println("matriz original:");
        imprimirmatriz(matriz);

        int filaAOrdenar = 1; // Cambia este valor para ordenar otra fila
        ordenarFila(matriz, filaAOrdenar);

        System.out.println("matriz con la fila " + filaAOrdenar + " ordenada:");
        imprimirmatriz(matriz);
    }

    public static void ordenarFila(int[][] matriz, int fila) {
        Arrays.sort(matriz[fila]);
    }

    public static void imprimirmatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }}}
    
