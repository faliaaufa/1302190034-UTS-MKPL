package lib;

public class Employee extends AnnualIncomeTax{

    private enum Gender{
        Laki_Laki, Perempuan
    }
    private String employeeId;
    private String firstName;
    private String lastName;
    private String idNumber;
    private String address;   
    private Gender gender; //1
	
    public Employee(String employeeId, String firstName, String lastName, String idNumber, String address, Gender gender) {		
        this.employeeId = employeeId;
		this.firstName = firstName;
        this.lastName = lastName;
		this.idNumber = idNumber;
        this.address = address;
		this.gender = gender;
    }

    public String getIdNumber() {
        return idNumber;
    }
}