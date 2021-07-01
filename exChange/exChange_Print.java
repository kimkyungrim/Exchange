package exChange;

public class exChange_Print {

	public void print(String moneyText, double exchangeRate, int moneyType, int returnMoney, int returnWon) {
		System.out.printf("\n%s을(를) 선택하셨습니다.\n", moneyText);
		System.out.printf("\n현재 환율은 1 %s에 %f 원 입니다.\n", moneyText, exchangeRate);

	}
	
}