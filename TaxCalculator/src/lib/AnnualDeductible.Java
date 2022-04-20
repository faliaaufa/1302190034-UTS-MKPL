package lib;

public class AnnualDeductible extends MonthlySalary{
    private int yearJoined;
    private int monthJoined;
    private int dayJoined;
    private int monthWorkingInYear;
    private MonthlySalary income;
    private HaveSpouse spouse;
    private HaveChild child;
    
    public int getAnnualIncomeTax() {
    //Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
	LocalDate date = LocalDate.now();		
	if (date.getYear() == yearJoined) {
            monthWorkingInYear = date.getMonthValue() - monthJoined;
	}else {
            monthWorkingInYear = 12;
	}		
	return TaxFunction.calculateTax(
            income.getMonthlySalary(), 
            income.getOtherMonthlyIncome(), 
            monthWorkingInYear, 
            income.getAnnualDeductible(), 
            spouse.getSpouseIdNumber().equals(""), 
            child.getChildIdNumbers().size()
        );
    }
}