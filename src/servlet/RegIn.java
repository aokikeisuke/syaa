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

@MultipartConfig(location = "getServletConfig().getRealPath('/syaa/WEB-INF/instancePic')",  maxFileSize = 16777215L)
@WebServlet("/syaa/servlet/RegOut")

	
	public class RegIn extends HttpServlet {
		private static final long serialVersionUID = 1L;

		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
           HttpSession session = request.getSession(true);
           session.setAttribute("lastname",request.getParameter("lastname"));
           session.setAttribute("firstname", request.getParameter("firstname"));
           session.setAttribute("sublastname", request.getParameter("sublastname"));
           session.setAttribute("subfirstname", request.getParameter("subfirstname"));
           session.setAttribute("birthday", request.getParameter("birthday"));
           session.setAttribute("place", request.getParameter("place"));
           session.setAttribute("hobby", request.getParameter("hobby"));
           session.setAttribute("image", request.getParameter("image"));
           session.setAttribute("word", request.getParameter("word"));
           
           RegOutBeans regoutbeans = new RegOutBeans();
           regoutbeans.setFirstname("firstname");
           regoutbeans.setLastname("lastname");
           regoutbeans.setFsubname("fsubname");
           regoutbeans.setLsubname("lsubname");
//           regoutbeans.setBirthday("birthday");
           regoutbeans.setPlace("place");
           regoutbeans.setHobby("hobby");
           regoutbeans.setImage("image");
//           regoutbeans.setWord("word");
           
           
           
=======
			
>>>>>>> a66968debdc6f5f64e5fe5463a15fe228e1a35bb
		
			
			if(request.getParameter("lastname") == null || request.getParameter("firstname") == null || request.getParameter("sublastname") == null || request.getParameter("subfirstname") == null){
				System.out.println("名前とフリガナを入力してください");
				response.sendRedirect("/syaa/JSP/RegIn.jsp");
			}else{
			
				Part part = request.getPart("picture");
				String name = this.getFileName(part);
				if(this.isValidFile(name)){
					part.write(
							getServletContext().getRealPath("/syaa/WEB-INF/Pic") + "/" + name);
					
					HttpSession session = request.getSession();
			           session.setAttribute("lastname",request.getParameter("lastname"));
			           session.setAttribute("firstname", request.getParameter("firstname"));
			           session.setAttribute("sublastname", request.getParameter("sublastname"));
			           session.setAttribute("subfirstname", request.getParameter("subfirstname"));
			           session.setAttribute("birthday", request.getParameter("birthday"));
			           session.setAttribute("place", request.getParameter("place"));
			           session.setAttribute("hobby", request.getParameter("hobby"));
			           session.setAttribute("picture", request.getParameter("picture"));
			           session.setAttribute("word", request.getParameter("word"));
					
					response.sendRedirect("/syaa/JSP/RegOut.jsp");
					
				}else{
					response.getWriter().println("アップロードできませんでした");
				}
		     }
		}
		
		private String getFileName(Part part){
			String result = null;
			for(String disp : part.getHeader("Content-Disposition").split(";")){
				disp = disp.trim();
				if(disp.startsWith("filename")){
					result = disp.substring(disp.indexOf("=") + 1).trim();
					result = result.replace("\"","").replace("\\","/");
					int pos = result.lastIndexOf("/");
					if(pos >= 0){
						result = result.substring(pos + 1);
					}
					break;
				}
			}
			return result;
		}
		
		private boolean isValidFile(String name){
			if(name != null){
				String[] perms = {"gif", "jpg", "jpeg", "png"};
				String[] names = name.split("\\.");
				for(String perm : perms){
					if(perm.equals(names[names.length - 1])){
						return true;
					}
				}
			}
		return false;

	}
}
