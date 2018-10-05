package ex28Groups.movable;

public class Organism implements Movable{
    private int xcoord;
    private int ycoord;

    public Organism(int x, int y) {
        this.xcoord = x;
        this.ycoord = y;
    }

    @Override
    public String toString() {
        return "x: " + this.xcoord + "; y: " + this.ycoord;
    }

    @Override
    public void move(int dx, int dy) {
        this.xcoord = this.xcoord + dx;
        this.ycoord = this.ycoord + dy;
    }



}
