
import java.util.Scanner;

public class Main {
    static String palo;
    static String color;
    static String valor;

    static String cards;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Deck deck = new Deck();

        shuffle();
        head();
        pick();
        hand();
        deck.crearMazo();
    }

    private static void shuffle() {

       System.out.print("Se mezclo el Deck");

    }

    private static void head() {
        System.out.println(palo+", "+color+", "+valor);
        System.out.println("Quedan " +cards);
    }

    private static void pick() {
        System.out.println(palo+", "+color+", "+valor);
        System.out.println("Quedan " +cards);
    }

    private static void hand() {
        System.out.println(palo+", "+color+", "+valor);
        System.out.println(palo+", "+color+", "+valor);
        System.out.println(palo+", "+color+", "+valor);
        System.out.println(palo+", "+color+", "+valor);
        System.out.println(palo+", "+color+", "+valor);
        System.out.println("Quedan " +cards);
    }
}

 class Card {

    private String palo;
    private String color;
    private int valor;

    public static final String[] palos = {"DIAMANTES", "Corazones", "Rombos", "Treboles"};
    public static final String[] colores = {"ROJO", "NEGRO"};
    public static final int limCartaPalo = 12;


    public Card(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
        this.color = color;
    }


    public String toString() {

        return "Valor = " + valor + ", Figura= " + palo + ", Color = " + colores;
    }
}

class Deck{
    public Card cards[];

    public void crearMazo(){

        String [] palos=Card.palos;
        String [] colores=Card.colores;


            for(int i=0;i<palos.length;i++){
                for (int j = 0; j<Card.limCartaPalo;j++){
                    if (!(j==7 || j == 8)){
                        if (j>=9){

                        }else {

                            cards[((i*(Card.limCartaPalo-2))+j)] = new Card(j+1, palos[i]);

                        }
                    }
                }
            }

    }
    }