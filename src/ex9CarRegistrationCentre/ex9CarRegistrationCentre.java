package ex9CarRegistrationCentre;

import java.util.ArrayList;
import java.util.HashMap;

public class ex9CarRegistrationCentre {

    public static void main (String [] args) {
        System.out.println("hello ex9");

        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        ArrayList<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate newy = new RegistrationPlate("FI", "ABC-123");
        if (!finnish.contains(newy)) {
            finnish.add(newy);
        }
        System.out.println("Finnish: " + finnish);
        // if the equals method hasn't been overwritten, the same registration plate is repeated in the list

        VehicleRegister registration = new VehicleRegister();
        registration.add(reg3, "Paul");
        registration.add(reg1, "Arto");
        registration.add(reg2, "Jurgen");

        System.out.println("\nOwners:");
        registration.printOwners();

        System.out.println("\nPlates:");
        registration.printRegistrationPlates();
    }
}
