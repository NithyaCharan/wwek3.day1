package week3.day1.assignment;

public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("Deposit your money in axis bank");
	}
	
	public static void main(String[] args) {
		
		AxisBank ab = new AxisBank();
		
		//example for method overriding
		//method deposit in AxisBank overrides method deposit in BankInfo
		//when giving ab. , it displays method deposit only from AxisBank
		
		ab.deposit();
		ab.fixed(); 
		ab.saving();
		
	}
}
