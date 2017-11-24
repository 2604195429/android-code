package oo.day06;

public class UnionPayTest {

	public static void main(String[] args) {
		ABCATM atm = new ABCATM();
		UnionPay card = new ABCIpml();
		atm.insertCard(card);
		atm.payTelBill();
	}

}

class ABCATM {
	private UnionPay card;

	public void insertCard(UnionPay card) {
		this.card = card;
	}

	public void payTelBill() {
		if(card instanceof ABC) {
			ABC abcCard=(ABC)card;
			abcCard.payTelBill("1112122");
		}else {
			System.out.println("不是农行");
		}
	}
}

class ABCIpml implements ABC {

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean drawMoney(double number) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkePwd(String input) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean payTelBill(String phoneNumber) {
		// TODO Auto-generated method stub
		return false;
	}

}

class ICEBCImpl implements ICBC {

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean drawMoney(double number) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkePwd(String input) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void payOnline(double number) {
		// TODO Auto-generated method stub

	}

}

interface UnionPay {
	public double getBalance();

	public boolean drawMoney(double number);

	public boolean checkePwd(String input);
}

interface ICBC extends UnionPay {
	public void payOnline(double number);
}

interface ABC extends UnionPay {
	public boolean payTelBill(String phoneNumber);
}
