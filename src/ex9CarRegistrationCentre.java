import java.util.ArrayList;
import java.util.HashMap;

public class ex9CarRegistrationCentre {

    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        System.out.println(reg3.getClass());

        ArrayList<RegistrationPlate> finnish = new ArrayList<>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate newreg1 = new RegistrationPlate("FI", "ABC-123");
        if (!finnish.contains(newreg1)) {
            finnish.add(newreg1);
        }
        System.out.println("Finnish: " + finnish);
        // if the equals method hasn't been overwritten, the same registration plate is repeated in the list

        HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
        owners.put(reg1, "Arto");
        owners.put(reg3, "Jürgen");

        System.out.println("owners:");
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
        System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));
        // if the hashCode hasn't been overwritten, the owners are not found


        // Exercise 9.2
        VehicleRegister vehicleRegister = new VehicleRegister();
        vehicleRegister.add(reg1, "Paul");
        vehicleRegister.add(reg2, "Lauren");
        vehicleRegister.add(reg3, "Someone Else");
        System.out.println(vehicleRegister.get(reg1));
        System.out.println(vehicleRegister.get(reg2));
        System.out.println(vehicleRegister.get(reg3));

        vehicleRegister.add(new RegistrationPlate("FI", "ABC-123"), "Paul2");
        System.out.println("Should be Paul: " + vehicleRegister.get(reg1));
        System.out.println("\n");

        // Exercise 9.3
        vehicleRegister.printRegistrationPlates();
        System.out.println("\n");
        vehicleRegister.printOwners();
    }
}
