package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/syaa/servlet/Top")
public class Top extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String submit = request.getParameter("Top");
		if(submit.equals("Edit")){
			response.sendRedirect("http://localhost.8080/syaa/JSP/Edit.jsp");
		}
		if(submit.equals("Search")){
			response.sendRedirect("http://localhost.8080/syaa/JSP/SearchIn.jsp");
		}
		
	}
}
