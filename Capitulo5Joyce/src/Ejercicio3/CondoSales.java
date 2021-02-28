package Ejercicio3;
import java.util.Scanner;
public class CondoSales {
    Scanner sc = new Scanner(System.in);
    private Integer condominio;

    public CondoSales(){
        System.out.println("Introduce el numero de condominio 1-3");
        condominio = sc.nextInt();
    }

    public Integer getCondominio() {
        return condominio;
    }

    public void precio(){
        switch (this.condominio){
            case 1:
                System.out.println("Los condominios con vista al parque cuestan $ 150,000");
            break;
            case 2:
                System.out.println("Los condominios con vista al campo de golf cuestan $ 170,000");
            break;
            case 3:
                System.out.println("Los condominios con vista al lago cuestan $ 210,000.");
            break;
            default:
                System.out.println("El precio es de 0");
            break;
        }
    }


}
