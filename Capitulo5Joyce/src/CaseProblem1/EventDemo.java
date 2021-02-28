package CaseProblem1;

import java.util.ArrayList;
import java.util.Scanner;

public class EventDemo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Event> eventos = new ArrayList<>();

        for (int i = 0; i < 1; i++) {

            System.out.println("Introduce el evento");
            String even = sc.nextLine();

            System.out.println("Introduce el numero de invitados");
            int inv = sc.nextInt();

            eventos.add(new Event(even,inv));

        }

        for (int i = 0; i < eventos.size(); i++) {
            System.out.println(eventos.get(i).getEvento());
            System.out.println(eventos.get(i).getNumerdoDeInvitados());
        }

    }
}
