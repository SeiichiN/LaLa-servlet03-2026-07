package servlet;

import java.io.IOException;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.ParseDateLogic;
import model.Person;

@WebServlet("/PersonServlet")
public class PersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "WEB-INF/jsp/person.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		
		ParseDateLogic logic = new ParseDateLogic();
		LocalDate birthDate = logic.execute(birthday);
		Person p = new Person(name, birthDate);
		request.setAttribute("person", p);
		String url = "WEB-INF/jsp/person.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}
	

}
