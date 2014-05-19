package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ans = request.getParameter("answer");
		if ("シャア".equals(ans)){
			response.sendRedirect("http://localhost.8080/syaa/JSP/Top.jsp");
		}else{
			PrintWriter out = response.getWriter();
			out.println("<script type='text/javascript'>"); 
			out.println("alert(' * パスワードが違います * ');"); 
			out.println("history.back();");
			out.println("</script>"); 
			out.close();
			response.sendRedirect("http://localhost.8080/syaa/JSP/Login.jsp");
			return;
		}
	}

}
