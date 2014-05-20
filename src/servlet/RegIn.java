package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@MultipartCinfig(location = "getServletContext().getRealPath("/syaa/WEB-INF/instancePic")")
@WebServlet("/syaa/servlet/RegOut")

	
	public class RegIn extends HttpServlet {
		private static final long serialVersionUID = 1L;

		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           HttpSession session = request.getSession(true);
			String firstname = (String)session.getAttribute("firstname");
			String lastname = (String)session.getAttribute("lastname");
			String fsubname = (String)session.getAttribute("fsubname");
			String lsubname = (String)session.getAttribute("lsubname");
		
			
			if(firstname == null || lastname == null || fsubname == null || lsubname == null){
				System.out.println("名前とフリガナを入力してください");
				response.sendRedirect("/syaa/JSP/RegIn.jsp");
			}else{
			
			Part part = request.getPart("picture");
			String name = this.getFileName(part);
			if(this.isValidFile(name)){
				part.write(
						getServletContext().getRealPath("WEB-INF/data") + "/" + name);
				       response.sendRedirect("RegIn.jsp");
			}else{
				response.getWriter().println("アップロードできませんでした");
			}
		}
		}
		
		private String getFileName(Part part){
			String result = null;
			for(Strign disp : part.getHeader("Content-Disposition").split(";")){
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
				for(String perm : perm){
					if(perm.equals(names[name.length - 1])){
						return true;
					}
				}
			}
		return false;

	}
}
