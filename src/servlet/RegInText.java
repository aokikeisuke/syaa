package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import beans.RegOutBeans;

@MultipartConfig(location = "getServletConfig().getRealPath('/syaa/WEB-INF/instancePic')", maxFileSize = 16777215L)
@WebServlet("/servlet/RegInText")
public class RegInText extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// System.out.println("lastname: " + request.getParameter("lastname"));
		// System.out.println("firstname: " +
		// request.getParameter("firstname"));
		// System.out.println("lsubname: " + request.getParameter("lsubname"));
		// System.out.println("fsubname: " + request.getParameter("fsubname"));

		if ("".equals(request.getParameter("lastname"))
				|| "".equals(request.getParameter("firstname"))
				|| "".equals(request.getParameter("lsubname"))
				|| "".equals(request.getParameter("fsubname"))) {
			                                               //  System.out.println("名前とフリガナを入力してください");  
			                                                 response.getWriter().println("名前とフリガナを入力してください");
			response.sendRedirect("/syaa/JSP/RegIn.jsp");
		} else {

			HttpSession session = request.getSession();
			String ln = request.getParameter("lastname");
			String fn = request.getParameter("firstname");
			String sln = request.getParameter("lsubname");
			String sfn = request.getParameter("fsubname");
			String bd = request.getParameter("birthday");
			String pl = request.getParameter("place");
			String hb = request.getParameter("hobby");
			String wd = request.getParameter("word");

			session.setAttribute("lastname", request.getParameter("lastname"));
			session.setAttribute("firstname", request.getParameter("firstname"));
			session.setAttribute("sublastname",
					request.getParameter("sublastname"));
			session.setAttribute("subfirstname",
					request.getParameter("subfirstname"));
			session.setAttribute("birthday", request.getParameter("birthday"));
			session.setAttribute("place", request.getParameter("place"));
			session.setAttribute("hobby", request.getParameter("hobby"));
			session.setAttribute("word", request.getParameter("word"));

			RegOutBeans regoutbeans = new RegOutBeans();
			regoutbeans.setFirstname(ln);
			regoutbeans.setLastname(fn);
			regoutbeans.setFsubname(sln);
			regoutbeans.setLsubname(sfn);
			regoutbeans.setBirthday(bd);
			regoutbeans.setPlace(pl);
			regoutbeans.setHobby(hb);
			regoutbeans.setWord(wd);

			response.sendRedirect("/syaa/JSP/RegInImage.jsp");

		}
	}

}
