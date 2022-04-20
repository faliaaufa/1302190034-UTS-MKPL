package lib;

public class HaveSpouse extends HaveChild{
    private String spouseName;
    private String spouseIdNumber;
    private Employee employee;
    
    public void setSpouse(String spouseName, String spouseIdNumber) {
        this.spouseName = spouseName;
	    this.spouseIdNumber = employee.getIdNumber();
    }

    public String getSpouseName() {
        return spouseName;
    }

    public String getSpouseIdNumber() {
        return spouseIdNumber;
    }
}