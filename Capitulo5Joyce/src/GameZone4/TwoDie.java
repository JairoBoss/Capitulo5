package GameZone4;

public class TwoDie {
    public static void main(String[] args) {
        Die dado1 = new Die();
        Die dado2 = new Die();

        if (dado1.getvalor() == dado2.getvalor()){
            System.out.println("Empate");
        }else if (dado1.getvalor() > dado2.getvalor()){
            System.out.println("Dado 1 es mas grande");
        }else{
            System.out.println("Dado 2 es mas grnade");
        }
    }
}
