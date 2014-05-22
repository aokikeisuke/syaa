package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.DeleteBeans;
import beans.EditBeans;

/**
 * Servlet implementation class Edit
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		HttpSession session = request.getSession();
		//IDはint指定ではない？
		//ここでIDを取得するためにはSearchInBeans.javaで
		//select *で取得したものをsessionだか何かで送る必要あり。
		String id = request.getParameter("id");
		session.setAttribute("id", request.getParameter("id"));

		DeleteBeans deletebeans = new DeleteBeans();
		deletebeans.setId(id);
		
		beans.DeleteBeans.DateBaseDelete(deletebeans);
		//EditBeans.javaの、データベースに上書きするメソッドを呼び出す。

		response.sendRedirect("/syaa/JSP/Top");
		
	}

}
