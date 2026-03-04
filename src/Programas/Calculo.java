/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

import java.util.Scanner;


/**
 *
 * @author Maro
 */
public class Calculo {
    public static void main(String[] args){
        
        Scanner lectura = new Scanner(System.in);
        
        double venta1, venta2, venta3, tv, pv;
        String vendedor;
        
        System.out.print("Ingrese nombre de vendedor: ");
        vendedor = lectura.next();
        
        System.out.print("Ingrese valor venta 1: S/");
        venta1 = lectura.nextDouble();
        
        System.out.print("Ingrese valor venta 2: S/");
        venta2 = lectura.nextDouble();
        
        System.out.print("Ingrese valor venta 3: S/");
        venta3 = lectura.nextDouble();
        System.out.println("");

        tv = venta1 + venta2 + venta3;
        System.out.println("Total Ventas: S/" + tv);
        
        pv = tv/3;
        System.out.println("Promedio Ventas: S/" + pv);
    }
}
