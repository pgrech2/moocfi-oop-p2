package ex9CarRegistrationCentre;

import java.util.HashMap;

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners = new HashMap<>();

    public boolean add (RegistrationPlate plate, String owner) {
        if (owners.get(plate) == null) {
            owners.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get (RegistrationPlate plate) {
        String owner = owners.get(plate);
        if (owner != null) {
            return owner;
        }
        return null;
    }

    public boolean delete (RegistrationPlate plate){
        String owner = owners.remove(plate);
        if (owner != null) {
            return true;
        }
        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate.toString());
        }
    }

    public void printOwners() {
        for (String owners : owners.values()) {
            System.out.println(owners);
        }
    }
}
