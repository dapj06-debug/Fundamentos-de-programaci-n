/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa1_busqueda2d.java;

/**
 *
 * @author Diego Pulig
 */
public class Programa1_Busqueda2DJava {

    public static void main(String[] args) {
        int [][] matriz = {
            {2,5,6},
            {4,3,7},
            {1,8,9},
        };
        int valorBuscado = 3;
        int[] posicion = buscarValor(matriz, valorBuscado);
        
        System.out.println("posicion: [" + posicion [0] + " , " + posicion [1]+"]");
    }
    public static int[] buscarValor(int[][] matriz, int valor) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valor) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    }    
    
                
        
