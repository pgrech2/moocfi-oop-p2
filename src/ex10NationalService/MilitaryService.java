package ex10NationalService;

public class MilitaryService implements NationalService{

    private int daysleft;

    public MilitaryService(int daysleft){
        this.daysleft = daysleft;
    }

    @Override
    public int getDaysLeft() {
        return this.daysleft;
    }

    @Override
    public void work() {
        this.daysleft--;
    }
}
