package exChange;

public class exChange_Process {

	public final double EXCHANGE_RATE_USD = 1131.80;
	public final double EXCHANGE_RATE_EUR = 1346.23;
	public static final double EXCHANGE_RATE_JPY = 10.25;
	public double exchangeRate = 0, exchange = 0;
	public int returnMoney = 0, returnWon = 0;
	public String moneyText = null;
	
	public void process(double inputWon, int moneyType) {
		if(moneyType == 1) {
			moneyText = "USD";
			exchangeRate = EXCHANGE_RATE_USD;
		} else if(moneyType == 2) {
			moneyText = "EUR";
			exchangeRate = EXCHANGE_RATE_EUR;
		} else {
			moneyText = "JPY";
			exchangeRate = EXCHANGE_RATE_JPY;
		}
		
		exchange = inputWon / exchangeRate;
		returnMoney = (int)exchange;
		exchange = exchange - returnMoney;
		returnWon = (int)(exchange*exchangeRate);
		returnWon = returnWon / 10 * 10;
		
	}
	
}