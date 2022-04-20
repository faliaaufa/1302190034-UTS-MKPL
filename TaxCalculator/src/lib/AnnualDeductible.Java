package lib;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Date;

public class AnnualDeductible extends MonthlySalary{
    private Year yearJoined;
    private Month monthJoined;
    private Date dayJoined;
    private int monthWorkingInYear;
    private MonthlySalary income;
    private HaveSpouse spouse;
    private HaveChild child;
    
    public int getAnnualIncomeTax() {
    //Menghitung berapa lama pegawai bekerja dalam setahun ini
	LocalDate date = LocalDate.now();		
	if (date.getYear() == Integer.parseInt(yearJoined.toString())) {
        monthWorkingInYear = date.getMonthValue() - Integer.parseInt(monthJoined.toString());
	}else {
        //jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
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