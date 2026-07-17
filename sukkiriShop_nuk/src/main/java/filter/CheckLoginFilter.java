package filter;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebFilter(urlPatterns = {"/CreateAccountServlet","/CreateDoneServlet",
						"/UpdateAccountServlet","/UpdateDoneServlet",
    					"/MainServlet", "/UpdateItemServlet"})
public class CheckLoginFilter extends HttpFilter {

	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpSession session = request.getSession(false);
		if (session != null) {
			String userId = (String)session.getAttribute("userId");
			if (userId == null || userId.length() == 0) {
				response.sendRedirect("WelcomeServlet");
				return;
			}
		}
		
		chain.doFilter(request, response);
	}

}
