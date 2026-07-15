package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import model.Account;
import servlet.util.Validate;

@WebServlet("/CreateAccountServlet")
public class CreateAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "WEB-INF/jsp/createAccount.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Account account = getAccount(request);
		List<String> errors = new ArrayList<>();
		Validate validate = new Validate();
		validate.check(account, errors);
		String url = null;
		if (errors.size() == 0) {
			HttpSession session = request.getSession();
			session.setAttribute("account", account);
			url = "WEB-INF/jsp/createConfirm.jsp";
		} else {
			request.setAttribute("errors", errors);
			url = "WEB-INF/jsp/createAccount.jsp";
		}
		request.getRequestDispatcher(url).forward(request, response);
	}
	
	private Account getAccount(HttpServletRequest request) {
		String userId = request.getParameter("userId");
		String pass = request.getParameter("pass");
		String mail = request.getParameter("mail");
		String name = request.getParameter("name");
		int age = 0;
		try {
			age = Integer.parseInt(request.getParameter("age"));
		} catch (NumberFormatException e) {
			age = 0;
		}
		Account account = new Account(userId, pass, mail, name, age);
		return account;
	}

}
