package Angabe04;
import java.util.Arrays;

public class TestGame {
    public static void main(String[] args) {
        BatttleShipGame bsg = new BatttleShipGame(); //Instanz erzeugen
        bsg.displayField(); //Feld Zeichnen

        //Staerke pro Player
        System.out.println(bsg.battleShipStrength('A'));
        System.out.println(bsg.battleShipStrength('B'));

        //Gesamtanzahl an Schiffen auf der Karte zuruckgeben
        System.out.println(bsg.countBattleShips());


        //Schiffe pro Zeile zaehlen
        System.out.println(Arrays.toString(bsg.countOfShipsPerLine()));

        System.out.println(bsg.totalShipsA());

        System.out.println(bsg.averageShipStrengthPlayerA());

    }
}
