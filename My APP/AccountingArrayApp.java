
public class AccountingArrayApp {

	public static void main(String[] args) {
		
		double ValueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = ValueOfSupply * vatRate;
		double total = ValueOfSupply + vat;
		double Expense = ValueOfSupply * expenseRate;
		double income = ValueOfSupply - Expense;
		
		double[] dividend = {income * 0.5, income * 0.3, income * 0.2};
		
		System.out.println("Value of supply : " + ValueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);
		System.out.println("Expense : " + Expense);
		System.out.println("Income : " + income);
		System.out.println("Dividend 1 : " + dividend[0]);
		System.out.println("Dividend 2 : " + dividend[1]);
		System.out.println("Dividend 3 : " + dividend[2]);
	}
}