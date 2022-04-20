package lib;
public class monthlySalary extends HaveSpouse{
    // Tipe kewarganegaraan
    private enum Citizens{
        foreign, local
    }

    private int monthlySalary;
    private int otherMonthlyIncome;
    private int annualDeductible;

   private void setMonthlySalary(int grade, Citizens citizen) {	
        int grade_1 = 1;
        int grade_2 = 1;
        int grade_3 = 1;
        if (grade == grade_1) {
            monthlySalary = 3000000;
            isForeigner(citizen, monthlySalary);
	    }else if (grade == grade_2) {
            monthlySalary = 5000000;
            isForeigner(citizen, monthlySalary);
	    }else if (grade == grade_3) {
            monthlySalary = 7000000;
            isForeigner(citizen, monthlySalary);
        }
    }

    private int isForeigner(Citizens citizen, int monthlySalary){
        if (citizen == Citizens.foreign){
            monthlySalary = (int) (3000000 * 1.5);
            return monthlySalary;
        }
        return monthlySalary;
    }

    public void setAnnualDeductible(int deductible) {	
        this.annualDeductible = deductible;
    }
	
    public void setotherMonthlyIncome(int income) {	
        this.otherMonthlyIncome = income;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getOtherMonthlyIncome() {
        return otherMonthlyIncome;
    }

    public int getAnnualDeductible() {
        return annualDeductible;
    }
}