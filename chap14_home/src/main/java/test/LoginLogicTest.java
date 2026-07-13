package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import model.Login;
import model.LoginLogic;

class LoginLogicTest {
	private static LoginLogic logic;

	@BeforeAll
	static void setUp() {
		logic = new LoginLogic();
	}
	
	@Test
	void testOK() {
		Login login = new Login("minato", "1234");
		boolean result = logic.execute(login);
		assertEquals(true, result);
		
	}

	@Test
	void testNG() {
		Login login = new Login("minato", "12345");
		boolean result = logic.execute(login);
		assertEquals(false, result);
		
	}
}
