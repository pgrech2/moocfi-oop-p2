package ex9CarRegistrationCentre;

public class RegistrationPlate {

    private final String regCode;
    private final String country;

    public RegistrationPlate (String regCode, String country) {
        this.regCode = regCode;
        this.country = country;
    }

    public String getRegCode () {
        return this.regCode;
    }

    public String getCountry () {
        return this.country;
    }

    public String toString(){
        return regCode + " " + country;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (this.getClass() != object.getClass()){
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) object;
        if (!this.regCode.equals(compared.getRegCode()) ||
                !this.country.equals(compared.getCountry())){
            return false;
        }

        return true;
    }

    public int hashCode() {
        if (this.regCode == null) {
            return 7;
        }

        return this.regCode.hashCode();
    }
}
