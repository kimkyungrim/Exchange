package exChange;

import java.util.Scanner;

public class exChange_Input {

	public double inputWon = 0;
	public int moneyType = 0;
	
	Scanner myInput = new Scanner(System.in);
	
	public void inputType() {
	System.out.print("ȯ���� ���� ���� (1:USD, 2:EUR, 3:JPY, 0: ����) ? ");
	moneyType = myInput.nextInt();
	}
	
	public void inputData() {
		System.out.print("���� ��ȭ �Է� : ");
		inputWon = myInput.nextDouble();
		
		myInput.close();
	}
	
}