package Lesson4;

public class Normals {
    private int x, y;
    private int diagonalUp, diagonalDown, horizontal, verticalDown;
    private int max=0;
    private char direction='_';

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDiagonalUp() {
        return diagonalUp;
    }

    public void setDiagonalUp(int diagonalUp) {
        this.diagonalUp = diagonalUp;
        if (max<diagonalUp) {
            max=diagonalUp;
            direction = '/';
        }
    }

    public int getDiagonalDown() {
        return diagonalDown;
    }

    public void setDiagonalDown(int diagonalDown) {
        this.diagonalDown = diagonalDown;
        if (max<diagonalDown) {
            max=diagonalDown;
            direction = '\\';
        }
    }

    public int getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
        if (max<horizontal) {
            max=horizontal;
            direction = '-';
        }
    }

    public int getVerticalDown() {
        return verticalDown;
    }

    public void setVerticalDown(int verticalDown) {
        this.verticalDown = verticalDown;
        if (max<verticalDown) {
            max=verticalDown;
            direction = '|';
        }
    }

    public int getMax() {
        return max;
    }

    public char getDirection() {
        return direction;
    }

    public String toString() {
        return "[ y:" + y + " x:" + x + " ][ DU:" + diagonalUp + " H:" + horizontal + " DD:" + diagonalDown +
                " VD:" + verticalDown + " ] [ max:"+max+" dir:"+direction+" ]";
    }
}