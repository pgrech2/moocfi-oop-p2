import java.util.HashMap;

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners = new HashMap<>();

    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.get(plate) == null) {
            this.owners.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate) {
        return this.owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (owners.get(plate) != null) {
            owners.remove(plate);
            return true;
        }
        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(owners.get(plate));
        }
    }
}
