package ex28Groups.movable;

import java.util.ArrayList;

public class Group implements Movable{

    ArrayList<Movable> movables = new ArrayList<>();
    private int xcoord;
    private int ycoord;

    public void addToGroup(Movable movable){
        this.movables.add(movable);
    }

    @Override
    public String toString(){
        String groupMovables = new String();
        for(Movable movable : this.movables) {
            groupMovables = groupMovables + movable + "\n";
        }
        return groupMovables;
    }

    @Override
    public void move(int dx, int dy) {
        this.xcoord = this.xcoord + dx;
        this.ycoord = this.ycoord + dy;
    }
}
