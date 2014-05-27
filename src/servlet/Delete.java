package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.DeleteBeans;
import beans.RegOutBeans;

@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		
		
		int id = Integer.parseInt(request.getParameter("id"));
		DeleteBeans deletebeans = new DeleteBeans();
		deletebeans.setId(id);
		DeleteBeans.DateBaseDelete(deletebeans);
		request.setAttribute("msg", "削除完了");
		
		this.getServletContext().getRequestDispatcher("/JSP/Top.jsp").forward(request, response);
	
	

}
}
