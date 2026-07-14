package test;

import model.Login;
import model.LoginLogic;

public class LoginLogicTest {

	public static void main(String[] args) {
		testExecuteOK();
		testExecuteNG();
	}
	
	public static void testExecuteOK() {
		Login login = new Login("minato", "1234");
		LoginLogic bo = new LoginLogic();
		boolean result = bo.execute(login);
	}
	
	public static void testExecuteNG() {
		
	}
}
