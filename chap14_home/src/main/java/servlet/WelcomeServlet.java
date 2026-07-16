package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		
		System.out.println("WelcomeServlet: session = " + session);
		Cookie[] cookies = request.getCookies();

		if (cookies != null) {
		    for (Cookie c : cookies) {
		        System.out.println(
		            c.getName() + " = " + c.getValue()
		        );
		    }
		}
		
		if (session == null) {
			System.out.println("WelcomeServlet: セッションはありません");
		} else {
			System.out.println("WelvomeServlet: セッションはあります");
		}

		String url = "WEB-INF/jsp/welcome.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

}
