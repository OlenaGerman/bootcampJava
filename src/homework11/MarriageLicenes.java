package homework11;

public class MarriageLicenes {
    private String familyName;
    private double marrigeRagistration;
    private double licenseNumber;

    public MarriageLicenes(String familyName, double marrigeRagistration, double licenseNumber){
        this.familyName = familyName;
        this.licenseNumber = licenseNumber;
        this.marrigeRagistration = marrigeRagistration;
    }

    public double getLicenseNumber() {
        return licenseNumber;
    }

    public double getMarrigeRagistration() {
        return marrigeRagistration;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}
