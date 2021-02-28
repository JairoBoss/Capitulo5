package Ejercicio1;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("El numero "+ numero + " es par.");
        }else {
            System.out.println("El numero "+ numero + " es inpar.");
        }
    }
}
