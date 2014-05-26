package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@MultipartConfig(location = "getServletConfig().getRealPath('/syaa/WEB-INF/instancePic')", maxFileSize = 16777215L)
@WebServlet("/servlet/EditText")
public class EditText extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
		if ("".equals(request.getParameter("lastname"))
				|| "".equals(request.getParameter("firstname"))
				|| "".equals(request.getParameter("lsubname"))
				|| "".equals(request.getParameter("fsubname"))) {
		    System.out.println("名前とフリガナを入力してください");  
			response.getWriter().println("名前とフリガナを入力してください");
			response.sendRedirect("/syaa/JSP/EditText.jsp");
		} else {

			HttpSession session = request.getSession();

			session.setAttribute("lastname", request.getParameter("lastname"));
			session.setAttribute("firstname", request.getParameter("firstname"));
			session.setAttribute("lsubname",request.getParameter("lsubname"));
			session.setAttribute("fsubname",request.getParameter("fsubname"));
			session.setAttribute("birthday", request.getParameter("birthday"));
			session.setAttribute("place", request.getParameter("place"));
			session.setAttribute("hobby", request.getParameter("hobby"));
			session.setAttribute("word", request.getParameter("word"));
			session.setAttribute("id", request.getParameter("id"));

			

			response.sendRedirect("/syaa/JSP/EditImage.jsp");

		}
	}

}
