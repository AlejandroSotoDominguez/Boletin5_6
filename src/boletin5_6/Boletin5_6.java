
package boletin5_6;

import java.util.Scanner;

public class Boletin5_6 {

    public static void main(String[] args) {
        int ventas;
        String articulo;
        Clase obx1 = new Clase();     
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de ventas");
        ventas = sc.nextInt();   
        obx1.almacen(ventas, "");
    }
}
