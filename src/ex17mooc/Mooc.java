package ex17mooc;

import ex17mooc.logic.ApplicationLogic;
import ex17mooc.ui.TextUserInterface;
import ex17mooc.ui.UserInterface;

public class Mooc {

    public static void main (String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
