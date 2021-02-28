package GameZone3;
import java.util.Scanner;
public class Card {
    private char suit;
    private int n;

    Scanner leer = new Scanner(System.in);

    public void setSuit(){
        this.suit = leer.next().charAt(0);
        leer.nextLine();
    }

    public void setN(){
        final int CARDS_IN_SUIT = 13;
        this.n = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
    }

    public char getSuit(){
        return this.suit;

    }

    public int getN(){
        return this.n;
    }



}
