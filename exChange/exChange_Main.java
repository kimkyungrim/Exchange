package exChange;

public class exChange_Main {
		
	public static void main(String[] args) {
		
		exChange_Input exchangeInput = new exChange_Input();
		exChange_Process exchangeProcess = new exChange_Process();
		exChange_Print exchangePrint = new exChange_Print();
		exChange_ReturnMoney exchangeReturnMoney = new exChange_ReturnMoney();
		exChange_Change exchangeChange = new exChange_Change();
					
		while(true) {
			
			exchangeInput.inputType();
			if(exchangeInput.moneyType == 0) {
				break;		
			}
			exchangeInput.inputData();
			exchangeProcess.process(exchangeInput.inputWon, exchangeInput.moneyType);
			exchangePrint.print(exchangeProcess.moneyText, exchangeProcess.exchangeRate, exchangeInput.moneyType, exchangeProcess.returnMoney, exchangeProcess.returnWon);
			exchangeReturnMoney.returnMoney(exchangeInput.moneyType, exchangeProcess.returnMoney, exchangeProcess.moneyText);
			exchangeChange.change(exchangeProcess.returnWon);
			break;
		}	
		
	} 
	
}