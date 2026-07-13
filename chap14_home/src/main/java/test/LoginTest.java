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
		Account account = dao.findByLogin(login);
		assertNotNull(account);
		// ↓が一番わかりやすい
		assertEquals("minato", account.getUserId());
		assertEquals("1234", account.getPass());
		assertEquals("yusuke.minato@miyabilink.jp", account.getMail());
		assertEquals("湊 雄輔", account.getName());
		assertEquals(23, account.getAge());
		/*
		assertAll("各フィールドの検証", 
				() -> assertEquals("minato", account.getUserId()),
				() -> assertEquals("1234", account.getPass()),
				() -> assertEquals("yusuke.minato@miyabilink.jp", account.getMail()),
				() -> assertEquals("湊 雄輔", account.getName()),
				() -> assertEquals(23, account.getAge()));	
		*/
	}

}
