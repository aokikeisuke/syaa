package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.EditBeans;


@WebServlet("/servlet/EditOut")
public class EditOut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
		String yesNo = request.getParameter("yesno");
		
		if(yesNo.equals("はい")){
			String ln = request.getParameter("lastname");
			String fn = request.getParameter("firstname");
			String sln = request.getParameter("lsubname");
			String sfn = request.getParameter("fsubname");
			String bd = request.getParameter("birthday");
			String pl = request.getParameter("place");
			String hb = request.getParameter("hobby");
			String im = request.getParameter("image");
			String wd = request.getParameter("word");
			int id = Integer.parseInt(request.getParameter("id"));
			
			EditBeans editbeans = new EditBeans();
			editbeans.setLastname(ln);
			editbeans.setFirstname(fn);
			editbeans.setLsubname(sln);
			editbeans.setFsubname(sfn);
			editbeans.setBirthday(bd);
			editbeans.setPlace(pl);
			editbeans.setHobby(hb);
			editbeans.setImage(im);
			editbeans.setWord(wd);
			editbeans.setId(id);

			EditBeans.DateBaseModify(editbeans);
// P141  セッションを明示的に破棄
			response.sendRedirect("/syaa/JSP/Top.jsp");
		}else{
			String ln = request.getParameter("lastname");
			String fn = request.getParameter("firstname");
			String sln = request.getParameter("lsubname");
			String sfn = request.getParameter("fsubname");
			String bd = request.getParameter("birthday");
			String pl = request.getParameter("place");
			String hb = request.getParameter("hobby");
			String im = request.getParameter("image");
			String wd = request.getParameter("word");
			int id = Integer.parseInt(request.getParameter("id"));
			
			request.setAttribute("lastname", ln);
			request.setAttribute("firstname", fn);
			request.setAttribute("lsubname", sln);
			request.setAttribute("fsubname", sfn);
			request.setAttribute("birthday", bd);
			request.setAttribute("place", pl);
			request.setAttribute("hobby", hb);
			request.setAttribute("image", im);
			request.setAttribute("word", wd);
			request.setAttribute("id", id);
			this.getServletContext().getRequestDispatcher("/JSP/EditText.jsp").forward(request, response);
		}
		
	
	}

}
