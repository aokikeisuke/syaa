package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.SearchOutBeans;


@WebServlet("/servlet/SearchOutSearch")
public class SearchOutSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		 String name = request.getParameter("search");
		 if("シャア".equals(name)){
			 response.sendRedirect("http://ja.wikipedia.org/wiki/%E3%82%B7%E3%83%A3%E3%82%A2%E3%83%BB%E3%82%A2%E3%82%BA%E3%83%8A%E3%83%96%E3%83%AB");
		 return;
		 }else if("casley".equals(name)){
			 response.sendRedirect("http://www.casleyconsulting.co.jp/");
			 return;
		 }else if("ドアラ".equals(name)){
			 response.sendRedirect("http://ja.wikipedia.org/wiki/%E3%83%89%E3%82%A2%E3%83%A9");
			 return;
		 }else if("キャスレー".equals(name)){
			 response.sendRedirect("http://www.casleyconsulting.co.jp/");
			 return;
		 }
		 name = name.replaceAll("　","");
		 name = name.replaceAll("\u0020","");
		 
		 ArrayList<SearchOutBeans> list = beans.SearchOutBeans.names(name);
		 request.setAttribute("list" ,list);
		 int objNum = list.size();
		 
		 request.setAttribute("keyWord" ,request.getParameter("search"));
		 request.setAttribute("objNum" ,objNum);
		
		 
		 this.getServletContext().getRequestDispatcher("/JSP/SearchOut.jsp").forward(request,response);
		 
	}

}
