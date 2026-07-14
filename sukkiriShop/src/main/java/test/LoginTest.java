package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dao.AccountsDAO;
import model.Account;
import model.Login;

class LoginTest {

	@Test
	void test() {
		Login login = new Login("minato", "1234");
		AccountsDAO dao = new AccountsDAO();
		Account result = dao.findByLogin(login);
		assertNotNull(result);
		assertEquals("minato", result.getUserId());
		assertEquals("1234", result.getPass());
		assertEquals("yusuke.minato@miyabilink.jp", result.getMail());
		assertEquals("湊 雄輔", result.getName());
		assertEquals(23, result.getAge());
	}

}
