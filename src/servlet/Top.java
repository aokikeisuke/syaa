package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.Address;

/**
 * Servlet implementation class Top
 */
@WebServlet("/Top")
public class Top extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Address> list = beans.TopBeans.getInfos();
		request.setAttribute("list", list);
		this.getServletContext().getRequestDispatcher("/syaa/Searchin").forward(request, response);
	}

}
