package ex17mooc.logic;

import ex17mooc.ui.UserInterface;

public class ApplicationLogic {

    private UserInterface ui;

    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }

    public void execute(int howManyTimes) {
        for (int i = 0; i < howManyTimes; ++i) {
            System.out.println("the applicationlogic works");
            ui.update();
        }
    }
}
