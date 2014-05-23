package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import beans.RegOutBeans;

@MultipartConfig(maxFileSize = 16777215L)
@WebServlet("/servlet/RegInImage")
public class RegInImage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		    Part part = request.getPart("image");
	        
		//if (!(null == part )) {      || "".equals(image)
			
			
			
			String name = this.getFileName(part);
			if (this.isValidFile(name)) {
				part.write(getServletContext().getRealPath("/Pic") + "/" + name);
//			System.out.println(getServletContext().getRealPath("/Pic"));
				HttpSession session = request.getSession();
				//session.setAttribute("image", request.getParameter("image"));
				//session.setAttribute("picPath",getServletContext().getRealPath("/Pic") + "/" + name);
				request.setAttribute("image", name );
				this.getServletContext().getRequestDispatcher("/JSP/RegOut.jsp").forward(request,response);
				//response.sendRedirect("/syaa/JSP/RegOut.jsp");
				
				//	System.out.println(name);
			

			} else {
	            if("".equals(name)){
//	           	HttpSession session = request.getSession();
//            	request.setAttribute("lastname", session.getAttribute("lastname") );
//	            	request.setAttribute("name", name );
//	            	request.setAttribute("name", name );
//	            	request.setAttribute("name", name );
	            	this.getServletContext().getRequestDispatcher("/JSP/RegOut.jsp").forward(request,response);
//	            	response.sendRedirect("/syaa/JSP/RegOut.jsp");
				
			
	            }else{
	            	response.setCharacterEncoding("UTF-8");
	            	String alert = "アップロードできない種類のファイルです";
	            	request.setAttribute("alert", alert );
					this.getServletContext().getRequestDispatcher("/JSP/RegInImage.jsp").forward(request,response);
	            }
			}
	}

	private String getFileName(Part part) {
		String result = null;
		for (String disp : part.getHeader("Content-Disposition").split(";")) {
			disp = disp.trim();
			if (disp.startsWith("filename")) {
				result = disp.substring(disp.indexOf("=") + 1).trim();
				result = result.replace("\"", "").replace("\\", "/");
				int pos = result.lastIndexOf("/");
				if (pos >= 0) {
					result = result.substring(pos + 1);
				}
				break;
			}
		}
		return result;
	}

	private boolean isValidFile(String name) {
		if (name != null) {
			String[] perms = { "gif", "jpg", "jpeg", "png" };
			String[] names = name.split("\\.");
			for (String perm : perms) {
				if (perm.equals(names[names.length - 1])) {
					return true;
				}
			}
		}
		return false;

	}
}
