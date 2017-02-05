package Lesson4;

public class Normals {
    private int x, y;
    private int diagonalUp, diagonalDown, horizontal, verticalDown;

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
    }

    public int getDiagonalDown() {
        return diagonalDown;
    }

    public void setDiagonalDown(int diagonalDown) {
        this.diagonalDown = diagonalDown;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }

    public int getVerticalDown() {
        return verticalDown;
    }

    public void setVerticalDown(int verticalDown) {
        this.verticalDown = verticalDown;
    }

    public String toString() {
        return "[ y:" + y + " x:" + x + " ][ DU:" + diagonalUp + " H:" + horizontal + " DD:" + diagonalDown +
                " VD:" + verticalDown + " ]";
    }
}
