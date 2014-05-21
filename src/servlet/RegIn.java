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

<<<<<<< HEAD
@MultipartConfig(location = "getServletConfig().getRealPath('/syaa/WEB-INF/instancePic')",  maxFileSize = 16777215L)
@WebServlet("/syaa/servlet/RegIn")
=======
@MultipartConfig(location = "getServletConfig().getRealPath('/syaa/WEB-INF/instancePic')", maxFileSize = 16777215L)
@WebServlet("/syaa/servlet/RegIn")
public class RegIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
>>>>>>> develop

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("lastname") == null
				|| request.getParameter("firstname") == null
				|| request.getParameter("sublastname") == null
				|| request.getParameter("subfirstname") == null) {
			System.out.println("名前とフリガナを入力してください");
			response.sendRedirect("/syaa/JSP/RegIn.jsp");
		} else {

			Part part = request.getPart("image");
			String name = this.getFileName(part);
			if (this.isValidFile(name)) {
				part.write(getServletContext().getRealPath("/syaa/WEB-INF/Pic")
						+ "/" + name);

				HttpSession session = request.getSession();
				String ln = request.getParameter("lastname");
				String fn = request.getParameter("firstname");
				String sln = request.getParameter("sublastname");
				String sfn = request.getParameter("subfirstname");
				String bd = request.getParameter("birthday");
				String pl = request.getParameter("place");
				String hb = request.getParameter("hobby");
				String im = request.getParameter("image");
				String wd = request.getParameter("word");

				session.setAttribute("lastname",
						request.getParameter("lastname"));
				session.setAttribute("firstname",
						request.getParameter("firstname"));
				session.setAttribute("sublastname",
						request.getParameter("sublastname"));
				session.setAttribute("subfirstname",
						request.getParameter("subfirstname"));
				session.setAttribute("birthday",
						request.getParameter("birthday"));
				session.setAttribute("place", request.getParameter("place"));
				session.setAttribute("hobby", request.getParameter("hobby"));
				session.setAttribute("image", request.getParameter("image"));
				session.setAttribute("word", request.getParameter("word"));

				RegOutBeans regoutbeans = new RegOutBeans();
				regoutbeans.setFirstname(ln);
				regoutbeans.setLastname(fn);
				regoutbeans.setFsubname(sln);
				regoutbeans.setLsubname(sfn);
				regoutbeans.setBirthday(bd);
				regoutbeans.setPlace(pl);
				regoutbeans.setHobby(hb);
				regoutbeans.setImage(im);
				regoutbeans.setWord(wd);

				response.sendRedirect("/syaa/JSP/RegOut.jsp");

			} else {
				response.getWriter().println("アップロードできませんでした");
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
