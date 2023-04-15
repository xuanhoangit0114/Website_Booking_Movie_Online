package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.AccountDAO;
import model.AccountS;

@WebServlet(name="LoginController",urlPatterns = "/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = -4015599647677928668L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		String number_phoner=req.getParameter("number_phone");
		String password=req.getParameter("pass");
		String remember=req.getParameter("remember");
		AccountS a=null;	
		AccountDAO Adao=new AccountDAO();
		try {
			Cookie number_phone_inCookie=new Cookie("number_phone1", number_phoner);
			Cookie password_inCookie=new Cookie("password", password);
			a =Adao.Login(number_phoner, password);
			if(a == null) {
				if(a == null &&number_phoner !=null) {
					req.setAttribute("mess","Tài khoản chưa đăng ký!");					
				}	
				req.getRequestDispatcher("/views/client/Login.jsp").forward(req, resp);
			}
			else {
				if(remember !=null) {
					number_phone_inCookie.setMaxAge(60*60*24*365);
					password_inCookie.setMaxAge(60*60*24*365);
				}
				else {
					number_phone_inCookie.setMaxAge(0);
					password_inCookie.setMaxAge(0);				
				}
				resp.addCookie(number_phone_inCookie);
				resp.addCookie(password_inCookie);		
				HttpSession ses=req.getSession();
				ses.setAttribute("acc", a);			
		     resp.sendRedirect("trangchu");			
			}
		} catch (ClassNotFoundException e) {		
			e.printStackTrace();
		}	
	}
}
