/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculodescuento;

/**
 *
 * @author World
 */
public class CalculoDescuento {
    
    public static double calcularDescuento(double montoTotal, double porcentajeDescuento){
        return montoTotal*(porcentajeDescuento/100);
    }
    
    public static double calcularDescuento(double montoTotal){
        return calcularDescuento(montoTotal, 10);    
    }

    public static void main(String[] args) {
        
        double monto1 = 150;
        double descuento1 = calcularDescuento(monto1);
        System.out.println("Descuento aplicado (10% por defecto): " + descuento1);
        System.out.println("Monto final a pagar: " + (monto1 - descuento1));
    
        double monto2 = 200;
        double porcentajeDescuento2 = 15;
        double descuento2 = calcularDescuento(monto2, porcentajeDescuento2);
        System.out.println("Descuento aplicado (" + porcentajeDescuento2 + "%): " + descuento2);
        System.out.println("Monto final a pagar: " + (monto2 - descuento2));
        
    }
    
    
}
