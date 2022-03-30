package com.bridgelabz.sms;

interface ISBI {
	public void getPaymentSBI();
	default double getRateIntrestSBI() {
		return 5.7;
	}
}

interface IBOI {
	int abc = 10;
	public void getPaymentBOI();
	default double getRateIntrestBOI() {
		return 6.7;
	}
}

interface ICBI {
	public void getPaymentCBI();
	default double getRateIntrestCBI() {
		return 7.7;
	}
}


class RBI implements ISBI, IBOI, ICBI {

	@Override
	public void getPaymentCBI() {
		System.out.println("Payment for CBI");
	}

	@Override
	public void getPaymentBOI() {
		System.out.println("Payment for BOI");
	}

	@Override
	public void getPaymentSBI() {
		System.out.println("Payment for SBI");
	}
	
}

public class PaymentDemo {

	public static void main(String[] args) {
		ISBI sbi = new RBI();
		
		sbi.getPaymentSBI();
		
		IBOI boi = new RBI();
		
		boi.getPaymentBOI();
		boi.getRateIntrestBOI();
	}
}
