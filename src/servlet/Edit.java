package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.EditBeans;

/**
 * Servlet implementation class Edit
 */
@WebServlet("/Edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		HttpSession session = request.getSession();
		String ln = request.getParameter("lastname");
		String fn = request.getParameter("firstname");
		String sln = request.getParameter("lsubname");
		String sfn = request.getParameter("fsubname");
		String bd = request.getParameter("birthday");
		String pl = request.getParameter("place");
		String hb = request.getParameter("hobby");
		String im = request.getParameter("image");
		String wd = request.getParameter("word");
		//IDはint指定なのになぜかエラー。
		int id = request.getParameter("id");

		session.setAttribute("lastname", request.getParameter("lastname"));
		session.setAttribute("firstname", request.getParameter("firstname"));
		session.setAttribute("sublastname", request.getParameter("sublastname"));
		session.setAttribute("subfirstname",request.getParameter("subfirstname"));
		session.setAttribute("birthday", request.getParameter("birthday"));
		session.setAttribute("place", request.getParameter("place"));
		session.setAttribute("hobby", request.getParameter("hobby"));
		session.setAttribute("image", request.getParameter("image"));
		session.setAttribute("word", request.getParameter("word"));
		session.setAttribute("id", request.getParameter("id"));

		EditBeans editbeans = new EditBeans();
		editbeans.setFirstname(ln);
		editbeans.setLastname(fn);
		editbeans.setFsubname(sln);
		editbeans.setLsubname(sfn);
		editbeans.setBirthday(bd);
		editbeans.setPlace(pl);
		editbeans.setHobby(hb);
		editbeans.setImage(im);
		editbeans.setWord(wd);
		editbeans.setId(id);
		
		beans.EditBeans.DateBaseModify(editbeans);
		//EditBeans.javaの、データベースに上書きするメソッドを呼び出す。

		response.sendRedirect("/syaa/JSP/Top");
		
	}

}
