package exChange;

import java.util.Scanner;

public class exChange_Input {

	public double inputWon = 0;
	public int moneyType = 0;
	
	Scanner myInput = new Scanner(System.in);
	
	public void inputType() {
	System.out.print("환전할 종류 선택 (1:USD, 2:EUR, 3:JPY, 0: 종료) ? ");
	moneyType = myInput.nextInt();
	}
	
	public void inputData() {
		System.out.print("받은 원화 입력 : ");
		inputWon = myInput.nextDouble();
		
		myInput.close();
	}
	
}