package client.app;

import server.app.AdditionLogic;

public class AddingApp {

	public static void main(String[] args) {
		int num1=10,num2=20;	//	Initializing variables
		AdditionLogic add = new AdditionLogic();	//	Object Creation
		add.sum(num1, num2);	//	calling add Function
	}

}
