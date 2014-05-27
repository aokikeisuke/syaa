package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig(maxFileSize = 16777215L)
@WebServlet("/servlet/EditImage")
public class EditImage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		    Part part = request.getPart("image");
			String name = this.getFileName(part);
			if (this.isValidFile(name)) {
				part.write(getServletContext().getRealPath("/Pic") + "/" + name);
				request.setAttribute("image", name );
				this.getServletContext().getRequestDispatcher("/JSP/EditOut.jsp").forward(request,response);
			} else {
	            if("".equals(name)){
	            	this.getServletContext().getRequestDispatcher("/JSP/EditOut.jsp").forward(request,response);
	            }else{
	            	response.setCharacterEncoding("UTF-8");
	            	String alert = "アップロードできない種類のファイルです";
	            	request.setAttribute("alert", alert );
					this.getServletContext().getRequestDispatcher("/JSP/EditImage.jsp").forward(request,response);
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
