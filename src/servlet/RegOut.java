package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.RegOutBeans;


@WebServlet("/RegOut")
public class RegOut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String yesNo = request.getParameter("yesno");
		
		if(yesNo.equals("はい")){
			RegOutBeans.DataBaseInsert();
			response.sendRedirect("/syaa/JSP/Top");
		}else{
			response.sendRedirect("/syaa/JSP/RegIn");
		}
	
	}

}
