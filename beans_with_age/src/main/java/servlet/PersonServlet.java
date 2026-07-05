package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Person;
import model.ParseDateLogic;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

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
		try {
			ParseDateLogic logic = new ParseDateLogic();
			LocalDate birthDate = logic.execute(birthday);
			Person person = new Person(name, birthDate);
			request.setAttribute("person", person);
		} catch (DateTimeParseException e) {
			request.setAttribute("errorMsg", "日付が正しくありません");
		}

		String url = "WEB-INF/jsp/person.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}	

}
