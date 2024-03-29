package gameLaby.laby;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

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

    public boolean posEquals(Position p){
        return (this.x == p.getX() && this.y == p.getY());
    }
    public boolean posEquals(int x, int y){
        return (this.x == x && this.y == y);
    }



}
