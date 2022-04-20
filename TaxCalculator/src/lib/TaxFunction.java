package lib;

public class TaxFunction {

	public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
		
		int tax = 0;
		int net_income = ((monthlySalary + otherMonthlyIncome)*numberOfMonthWorking) - deductible;
        int income_notTaxable = 54000000;
        int income_notTaxableMarried = 54000000 + 4500000;
        int income_notTaxableChild = 1500000;
		
		if (numberOfMonthWorking > 12) {
			System.err.println("More than 12 month working per year");
		}
		
		if (numberOfChildren > 3) {
			numberOfChildren = 3;
		}
		
		if (isMarried) {
			tax = (int) Math.round(0.05 * (net_income - (income_notTaxableMarried+ (numberOfChildren * income_notTaxableChild))));
		}else {
			tax = (int) Math.round(0.05 * (income_notTaxableMarried - income_notTaxable));
		}
		
		if (tax < 0) {
			return 0;
		}else {
			return tax;
		}
			 
	}
	
}
