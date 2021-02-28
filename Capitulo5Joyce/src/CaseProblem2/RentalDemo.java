package CaseProblem2;

import java.util.ArrayList;
import java.util.Scanner;

public class RentalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Rental> renta = new ArrayList<>();

        for (int i = 0; i <1 ; i++) {
            System.out.println("Introduce el contrato");
            String x =  sc.nextLine();

            System.out.println("Introduce el numero de minutos");
            int y = sc.nextInt();

            renta.add(new Rental(x,y));

        }

        for (int i = 0; i <renta.size() ; i++) {
            System.out.println(renta.get(i).getContrato());
            System.out.println(renta.get(i).getMinutos());

        }
    }
}
