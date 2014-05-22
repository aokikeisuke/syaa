package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
// import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import beans.RegOutBeans;


//@MultipartConfig(location = "getServletConfig().getRealPath('/syaa/WEB-INF/instancePic')", maxFileSize = 16777215L)
@WebServlet("/servlet/RegInImage")
public class RegInImage extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

//		System.out.println("lastname: " + request.getParameter("lastname"));
//		System.out.println("firstname: " + request.getParameter("firstname"));
//		System.out.println("lsubname: " + request.getParameter("lsubname"));
//		System.out.println("fsubname: " + request.getParameter("fsubname"));
		
		
		
    Part part = request.getPart("image");
    String name = this.getFileName(part);
    if(this.isValidFile(name)){
    	part.write(
    			getServletContext().getRealPath("/WEB-INF/instancePic") + "/" + name);
    	HttpSession session = request.getSession();
    	session.setAttribute("image", request.getParameter("image"));
    	
    	
    	RegOutBeans regoutbeans = new RegOutBeans();
    	String im = request.getParameter("image");
    	regoutbeans.setImage(im);
    	
    	response.sendRedirect("/syaa/JSP/RegOut.jsp");
    	
    	
    }else{
    	response.getWriter().println("ファイルがアップロードできませんでした");
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
