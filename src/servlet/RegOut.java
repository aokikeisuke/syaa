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
			
			RegOutBeans regoutbeans = new RegOutBeans();
			regoutbeans.setLastname(ln);
			regoutbeans.setFirstname(fn);
			regoutbeans.setLsubname(sln);
			regoutbeans.setFsubname(sfn);
			regoutbeans.setBirthday(bd);
			regoutbeans.setPlace(pl);
			regoutbeans.setHobby(hb);
			regoutbeans.setImage(im);
			regoutbeans.setWord(wd);

			RegOutBeans.DataBaseInsert(regoutbeans);
// P141  セッションを明示的に破棄
			response.sendRedirect("/syaa/JSP/Top.jsp");
		}else{
			response.sendRedirect("/syaa/JSP/RegIn.jsp");
		}
		
	
	}

}
