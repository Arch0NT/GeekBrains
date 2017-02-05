package Lesson4;

import java.util.Scanner;

public class StrategyChooser {
    public static void chooseStrategy(Normals[][] battleFieldNormalize, int dot_to_win) {
        Normals normal = new Normals();
        int size = battleFieldNormalize.length;
        normal = battleFieldNormalize[0][0];
        Scanner scn = new Scanner(new String());
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (normal.getMax()<battleFieldNormalize[i][j].getMax())
                    normal=battleFieldNormalize[i][j];
            }
        }
        if (normal.getMax() < dot_to_win - 2) attackStrategy();
        else blockageStrategy(normal);
    }

    public static void blockageStrategy(Normals normal) {

    }

    public static boolean isCanBlock(Normals normal) {

        return false;
    }

    public static void attackStrategy() {

    }
}
