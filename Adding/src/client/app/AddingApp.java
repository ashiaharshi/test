package client.app;

import server.app.AdditionLogic;

public class AddingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10,num2=20;
		AdditionLogic add = new AdditionLogic();
		add.sum(num1, num2);
	}

}
