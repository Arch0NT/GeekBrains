package Lesson4;

import java.util.Random;

public class MyClass4 {
    public static char[][] battleField;
    public static final int SIZE = 3;
    public static final int DOT_TO_WIN = 3;
    public static final char X_DOT = 'X';
    public static final char O_DOT = 'O';
    public static Random rnd = new Random();

    public static void main(String[] args) {
        fieldInit();
        battleField[1][1]='X';
        battleField[0][0]='O';
        fieldPrint();
        BattleFieldAnalizer analizer = new BattleFieldAnalizer(battleField, SIZE, DOT_TO_WIN);
        analizer.go(X_DOT);
        analizer.print();
    }

    public static void fieldInit() {
        battleField = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                battleField[i][j]='_';
            }
        }
    }

    public static void fieldPrint() {
        for (int j = 0; j < SIZE; j++) {
            if (j == 0) System.out.print("   ");
            System.out.printf("%2d ", j);
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (j == 0) System.out.printf("%2d ", i);
                System.out.printf("%2c ", battleField[i][j]);
            }
            System.out.println();
        }
    }
}

