package week5.day5;

public class AxisBank extends BankInfo {
	public void Deposit () {
		System.out.println("Deposit the amount 25000k");
	}
	
	public static void main(String[] args) {
		AxisBank Account=new AxisBank();
		Account.Deposit();
		Account.fixed();
		Account.saving();
		Account.deposit();
	}

}
