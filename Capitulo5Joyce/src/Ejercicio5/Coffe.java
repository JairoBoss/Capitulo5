package Ejercicio5;
import java.util.Scanner;
public class Coffe {
    Scanner sc = new Scanner(System.in);
    private static final Double american = 1.99;
    private static final Double expresso = 2.50;
    private static final Double latte = 2.15;
    private Integer factura;
    private Integer opc;

    public void factura(){
        opc = 4;
        do {
            System.out.println("Ingrese su orden");
            System.out.println("[1] Americano $1.99");
            System.out.println("[2] Exprso $2.5");
            System.out.println("[3] Latte $2.15");
            System.out.println("[0] Salir");
            opc = sc.nextInt();
            switch (opc){

            }
        }while (opc != 0);

    }
}
