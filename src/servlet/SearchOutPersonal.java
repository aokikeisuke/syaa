package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/SearchOutPersonal/*")
public class SearchOutPersonal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getPathInfo();
		
		ArrayList<Info> info= beans.SearchInBeans.info(info);
		 request.setAttribute("info" ,info);
		 
		 this.getServletContext().getRequestDispatcher("/syaa/JSP/SearchOut").forward(request,response);
		 
	}

}