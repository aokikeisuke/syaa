package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.RegOutBeans;


@WebServlet("/servlet/RegOut")
public class RegOut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String yesNo = request.getParameter("yesno");
		
		if(yesNo.equals("はい")){
			HttpSession session = request.getSession();
			String ln = request.getParameter("lastname");
			String fn = request.getParameter("firstname");
			String sln = request.getParameter("lsubname");
			String sfn = request.getParameter("fsubname");
			String bd = request.getParameter("birthday");
			String pl = request.getParameter("place");
			String hb = request.getParameter("hobby");
			String wd = request.getParameter("word");
			
			RegOutBeans regoutbeans = new RegOutBeans();
			regoutbeans.setFirstname(ln);
			regoutbeans.setLastname(fn);
			regoutbeans.setFsubname(sln);
			regoutbeans.setLsubname(sfn);
			regoutbeans.setBirthday(bd);
			regoutbeans.setPlace(pl);
			regoutbeans.setHobby(hb);
			regoutbeans.setWord(wd);

			RegOutBeans.DataBaseInsert(regoutbeans);
			response.sendRedirect("/syaa/JSP/Top");
		}else{
			response.sendRedirect("/syaa/JSP/RegInText");
		}
		
	
	}

}
