package Ejercicio9;

import java.util.Scanner;

public class TestFactura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factura a = new Factura(9600,800,5,3,2011);
        System.out.println(a.getNoFactura());
        System.out.println(a.getSaldo());
        System.out.println(a.getDia());
        System.out.println(a.getMes());
        System.out.println(a.getAño());
    }

}
