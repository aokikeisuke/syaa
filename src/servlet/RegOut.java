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
			
			System.out.println(request.getParameter("image"));
			
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
			
			
			response.setCharacterEncoding("UTF-8");
	    	String topalert = "登録完了しました。";
	    	request.setAttribute("topalert", topalert );
	    	this.getServletContext().getRequestDispatcher("/JSP/Top.jsp").forward(request,response);   
// P141  セッションを明示的に破棄
//			response.sendRedirect("/syaa/JSP/Top.jsp");
		}else{
			request.setAttribute("lastname", request.getParameter("lastname"));
			request.setAttribute("firstname", request.getParameter("firstname"));
			request.setAttribute("lsubname", request.getParameter("lsubname"));
			request.setAttribute("fsubname", request.getParameter("fsubname"));
			request.setAttribute("birthday", request.getParameter("birthday"));
			request.setAttribute("place", request.getParameter("place"));
			request.setAttribute("hobby", request.getParameter("hobby"));
			request.setAttribute("image", request.getParameter("image"));
			request.setAttribute("word", request.getParameter("word"));
			
			this.getServletContext().getRequestDispatcher("/JSP/RegIn.jsp").forward(request,response);
		}
		
	
	}

}
