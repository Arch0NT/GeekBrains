package Lesson4;

public class BattleFieldAnalizer {
    public Normals[][] battleFieldNormalize;
    public char[][] battleField;
    public int size;
    public int dot_to_win;
    public char dot;
    public StrategyChooser strategy = new StrategyChooser();

    public BattleFieldAnalizer(char[][] battleField, int size, int dot_to_win) {
        this.battleField = battleField;
        battleFieldNormalize = new Normals[size][size];
        this.size = size;
        this.dot_to_win = dot_to_win;
    }

    public void go(char dot) {
        this.dot = dot;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                checkLines(i, j, dot);
            }
        }
        StrategyChooser.chooseStrategy(battleFieldNormalize,dot_to_win);
    }

    public void checkLines(int y, int x, char dot) {
        Normals normal = new Normals();
        normal.setX(x);
        normal.setY(y);
        normal.setDiagonalUp(checkDiagonalUp(y, x, dot));
        normal.setHorizontal(checkHorizontal(y, x, dot));
        normal.setDiagonalDown(checkDiagonalDawn(y, x, dot));
        normal.setVerticalDown(checkVerticalDawn(y, x, dot));
        battleFieldNormalize[y][x] = normal;
    }

    public int checkDiagonalUp(int y, int x, char dot) {
        int count = 0;
        for (int i = 0; i < dot_to_win; i++) {
            if (((y - i) < 0) || ((x + i) >= size)) continue;
            if (battleField[y - i][x + i] == dot) {
                count++;
            }
        }
        return count;
    }

    public int checkHorizontal(int y, int x, char dot) {
        int count = 0;
        for (int i = 0; i < dot_to_win; i++) {
            if ((x + i) >= size) continue;
            if (battleField[y][x + i] == dot) {
                count++;
            }
        }
        return count;
    }

    public int checkDiagonalDawn(int y, int x, char dot) {
        int count = 0;
        for (int i = 0; i < dot_to_win; i++) {
            if (((y + i) >= size) || ((x + i) >= size)) continue;
            if (battleField[y + i][x + i] == dot) {
                count++;
            }
        }
        return count;
    }

    public int checkVerticalDawn(int y, int x, char dot) {
        int count = 0;
        for (int i = 0; i < dot_to_win; i++) {
            if ((y + i) >= size) continue;
            if (battleField[y + i][x] == dot) {
                count++;
            }
        }
        return count;
    }

    public boolean isCellEmpty (int y, int x){
        return battleField[y][x]=='_';
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println(battleFieldNormalize[i][j].toString());
            }
        }
    }
}
