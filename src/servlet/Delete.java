package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.DeleteBeans;

@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		
		//分からないっす。requestgetParameterってString?
		int id = Integer.requestgetParameter("id");
		
		session.setAttribute("id", id);

		DeleteBeans deletebeans = new DeleteBeans();
		deletebeans.setId(id);

		DeleteBeans.DateBaseDelete(deletebeans);
		
		response.sendRedirect("/syaa/JSP/Top");

	}

}
