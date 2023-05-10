package Angabe04;

public class BatttleShipGame {
    int[][] map = {
            {1, 0, 0, 2, 0, 0, 1, 1, 0, 0},
            {3, 0, -1, 0, 0, 0, 2, 0, -1, 0},
            {0, 3, 0, 0, -1, 0, 0, 2, 0, 0},
            {0, 0, 0, 4, 4, 0, 1, 0, 0, 2},
            {0, -3, 2, 0, 0, 0, -1, 0, 0, 0},
            {0, 0, -2, 0, 0, -4, 0, 0, -1, 0},
            {0, 0, 0, 0, -3, 0, 0, 0, 0, 0},
            {0, 0, -2, 0, -2, 0, 0, -2, 0, 0}
    };

    //Feld zeichnen
    public void displayField() {
        for (int[] a : map) {
            for (int b : a) {
                if (b >= 0) {
                    System.out.print(b + "   ");
                } else {
                    System.out.print(b + "  ");
                }
            }
            System.out.println();
        }
    }

    public int battleShipStrength(char player) {
        int strengthA = 0;
        int strengthB = 0;

        for (int[] a : map) {
            for (int element : a) {
                if (element > 0) {
                    strengthA += element;
                } else if (element < 0) {
                    strengthB += element;
                }
            }

        }
        if (player == 'A') {
            return strengthA;
        } else if (player == 'B') {
            return strengthB * (-1);
        } else {
            System.out.println("Es kann nur A oder B Team sein...");
        }
        return 0; //Das return ist nur als Platzhalter, damit kein Fehler angezeigt wird
    }

    public int countBattleShips() {
        int counter = 0;
        for (int[] a : map) {
            for (int element : a) {
                if (element != 0) {
                    counter++;
                }
            }
        }


        return counter; //Das return ist nur als Platzhalter, damit kein Fehler angezeigt wird
    }

    public int[] countOfShipsPerLine() {
        int[] count = new int[8];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] != 0) {
                    count[i]++;
                }
            }

        }

        return count;
    }

    public int totalShipsA() {
        int counter = 0;
        for (int[] a : map) {
            for (int element : a) {
                if (element > 0) {
                    counter++;
                }
            }
        }
        return counter; //Das return ist nur als Platzhalter, damit kein Fehler angezeigt wird
    }

    public double averageShipStrengthPlayerA() {
        int battleShipStrength = battleShipStrength('A');
        int totalShipA = totalShipsA();
        return (double) battleShipStrength/ totalShipA;
    }
}
