package j4.HackU;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/HackU/Process")

public class Process extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException {
		//セッションの取得
		String Username = request.getParameter("Username");
		String gender = request.getParameter("gender");

		String Logout = request.getParameter("Logout");

		HttpSession hs = request.getSession(true);
		hs.setAttribute("error", 0);

		//セッションの設定

		ServletContext sc = getServletContext();

		if(gender!=null){

			if(gender.equalsIgnoreCase("Male")){
				hs.setAttribute("gender", 0);
			}
			else{
				hs.setAttribute("gender", 1);
			}
		}
		if(Logout != null){
			sc.getRequestDispatcher("/lesson10ex_jsp/Login.jsp")
        	.forward(request, response);
		}

		if(Username.length() != 0){
			hs.setAttribute("Username", Username);
	        	sc.getRequestDispatcher("/HackU/User.jsp")
	        	.forward(request, response);
	        }
		else{
	        	hs.setAttribute("error", 1);
	        	sc.getRequestDispatcher("/HackU/Login.jsp")
	        	.forward(request, response);

		}
	}
}

