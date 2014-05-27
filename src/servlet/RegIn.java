package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import beans.RegInBeans;
import beans.RegOutBeans;
import beans.SearchOutBeans;

@MultipartConfig(maxFileSize = 16777215L)
@WebServlet("/servlet/RegIn")
public class RegIn extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		if ("".equals(request.getParameter("lastname"))
				|| "".equals(request.getParameter("firstname"))
				|| "".equals(request.getParameter("lsubname"))
				|| "".equals(request.getParameter("fsubname"))) {
			response.setCharacterEncoding("UTF-8");
			String alert1 = "名前を入力して下さい。";
			request.setAttribute("alert1", alert1);
			this.getServletContext().getRequestDispatcher("/JSP/RegIn.jsp").forward(request, response);
			return;
		}
        
		RegInBeans obj = new RegInBeans();
		obj.setLastname(request.getParameter("lastname"));
		obj.setFirstname(request.getParameter("firstname"));
		obj.setLsubname(request.getParameter("lsubname"));
		obj.setFsubname(request.getParameter("fsubname"));
		obj.setPlace(request.getParameter("place"));
		obj.setHobby(request.getParameter("hobby"));
		obj.setWord(request.getParameter("word"));
		
		//入力文字数のチェック
		
        ArrayList<String> list = obj.checkStrLength();
        
        //ここでリストに入ったエラーメッセージをリクエストスコープの変数にセット、それをJSPで動的に受け取る
        
        if(list.size() > 0){
		request.setAttribute("list" ,list);
		this.getServletContext().getRequestDispatcher("/JSP/RegIn.jsp").forward(request, response);
		return;
        }
		 
        request.setAttribute("lastname", request.getParameter("lastname"));
		request.setAttribute("firstname", request.getParameter("firstname"));
		request.setAttribute("lsubname", request.getParameter("lsubname"));
		request.setAttribute("fsubname", request.getParameter("fsubname"));
		request.setAttribute("birthday", request.getParameter("birthday"));
		request.setAttribute("place", request.getParameter("place"));
		request.setAttribute("hobby", request.getParameter("hobby"));
		request.setAttribute("word", request.getParameter("word"));
		 
		//ファイルのアップロード処理
		Part part = request.getPart("image");

		String name = this.getFileName(part);
		if (this.isValidFile(name)) {
			part.write(getServletContext().getRealPath("/Pic") + "/" + name);

			request.setAttribute("image", name);
			

			this.getServletContext().getRequestDispatcher("/JSP/RegOut.jsp").forward(request, response);

		} else {
			if ("".equals(name)) {
				this.getServletContext()
						.getRequestDispatcher("/JSP/RegOut.jsp")
						.forward(request, response);

			} else {
				response.setCharacterEncoding("UTF-8");
				String alert = "アップロードできない種類のファイルです";
				request.setAttribute("alert1", alert);
				this.getServletContext().getRequestDispatcher("/JSP/RegIn.jsp")
						.forward(request, response);
			}
		}
	}

	
	//ファイルアップロードのためのファイル名編集
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

	//扱えるファイルを限定している
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
