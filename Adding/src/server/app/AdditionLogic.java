package server.app;

import server.AddTwoNumbers;

public class AdditionLogic implements AddTwoNumbers{

	@Override
	public void sum(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Sum = "+(a+b));
	}
}
