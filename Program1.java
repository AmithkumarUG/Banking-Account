package abstraction;

interface Act{
	public void debitAmount(int amt);
	public void creditAmount(int amt);
	public void showbal();
}

class Saveing implements Act{
	double bal=0.0;

	@Override
	public void debitAmount(int amt) {
		if(amt>0) {
			
			bal=bal+amt;
			System.out.println("amount added to account");
			
		}
		else
		{
			System.out.println("invalid amount");
		}
	}

	@Override
	public void creditAmount(int amt) {
		if(bal>amt) {
			
			bal=bal-amt;
			System.out.println("payament sucesfull");
		}
		
	}

	@Override
	public void showbal() {
		System.out.println("BAlance :"+bal);
		
	}
	
}

class Fd implements Act{
	double bal=0.0;

	@Override
	public void debitAmount(int amt) {
		if(amt>0) {
			
			bal=bal+amt;
			System.out.println("amount added to account");
			
		}
		else
		{
			System.out.println("invalid amount");
		}
	}

	@Override
	public void creditAmount(int amt) {
		if(bal>amt) {
			
			bal=bal-amt;
			System.out.println("payament sucesfull");
		}
		
	}

	@Override
	public void showbal() {
		System.out.println("BAlance :"+bal);
		
	}
	
}


class Admin{
	public static Act newFdAccount() {
		Act F1=new Fd();
		return F1;
	}
	
	public static Act newSavingAccount() {
		Act S1=new Fd();
		return S1;
	}
}




public class Program1 {

	public static void main(String[] args) {
		Act f1=Admin.newFdAccount();
		f1.debitAmount(100000);
		f1.creditAmount(2000);
		f1.showbal();
		
		Act s1=Admin.newSavingAccount();
		s1.debitAmount(200000000);
		s1.creditAmount(2000);
		s1.showbal();
		

	}

}
