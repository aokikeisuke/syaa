package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.SearchOutBeans;

@WebServlet("/servlet/SearchOutPersonal/*")
public class SearchOutPersonal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getPathInfo();
		
		ArrayList<SearchOutBeans> list = beans.SearchOutBeans.info(request.getParameter("request.getPathInfo"));
		
		request.setAttribute("list" ,list);
		 
		
		 this.getServletContext().getRequestDispatcher("/syaa/JSP/SearchOutPersonal.jsp").forward(request,response);
		 
	}

}