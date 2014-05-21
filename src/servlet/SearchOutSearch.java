package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/syaa/servlet/SearchOut/*")
public class SearchOutSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String name = request.getParameter("search");
		 name = name.replaceAll("　","");
		 name = name.replaceAll("\u0020","");
		 
		 beans.SearchInBeans.names(name);
	}

}
