package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dao.AccountsDAO;
import model.Account;
import model.Login;

class FindByLoginTest {
	private static Account account;

	@BeforeAll
	static void setUp() {
		Login login = new Login("minato", "1234");
		AccountsDAO dao = new AccountsDAO();
		account = dao.findByLogin(login);
	}
	
	@Test
	void testNotNull() {
		assertNotNull(account);
	}

	@Test
	@DisplayName("id検証")
	void testId() {
		assertEquals("minato", account.getUserId());
	}
	
	@Test
	@DisplayName("pass検証")
	void testPass() {
		assertEquals("1234", account.getPass());
	}
	
	@Test
	@DisplayName("mail検証")
	void testMain() {
		assertEquals("yusuke.minato@miyabilink.jp", account.getMail());
	}
	
	@Test
	@DisplayName("名前検証")
	void testName() {
		assertEquals("湊 雄輔", account.getName());
	}
	
	@Test
	@DisplayName("年齢検証")
	void testAge() {
		assertEquals(23, account.getAge());
	}
	
	
	
	@Test
	@DisplayName("各フィールドの検証")
	void testAll() {
		assertAll("各フィールドの検証", 
				() -> assertEquals("minato", account.getUserId()),
				() -> assertEquals("1234", account.getPass()),
				() -> assertEquals("yusuke.minato@miyabilink.jp", account.getMail()),
				() -> assertEquals("湊 雄輔", account.getName()),
				() -> assertEquals(23, account.getAge()));	
	}
	
}
