package GameZone5;

import java.util.Scanner;

public class RockPaperScissors {
    Scanner sc = new Scanner(System.in);
    private Integer opc;
    private Integer opcionPC;

    public void juego() {
        System.out.println("[1]Piedra [2]Papel [3]Tijeras");
        setOpcionPC();
        System.out.println(getOpcionPC());
        opc = sc.nextInt();

        if (opc == opcionPC) {
            System.out.println("Empate");
        } else if ((opc == 1 && opcionPC == 3) ||(opc == 2 && opcionPC == 1) ||(opc == 3 && opcionPC == 2)  ){
            System.out.println("Ganas");

        } else if ((opc == 1 && opcionPC == 2) || (opc == 2 && opcionPC == 3) || (opc == 3 && opcionPC == 1)){
            System.out.println("Pierdes");
        }

    }

    public Integer getOpcion() {
        return opc;
    }

    public void setOpcion(Integer opcion) {
        this.opc = opcion;
    }

    public Integer getOpcionPC() {
        return opcionPC;
    }

    private void setOpcionPC() {
        this.opcionPC = (int) (Math.random() * 3 + 1);
    }
}



