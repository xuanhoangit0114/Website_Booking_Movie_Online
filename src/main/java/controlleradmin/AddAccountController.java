package controlleradmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.AccountDAO;

@WebServlet(urlPatterns="/addAccount")
public class AddAccountController extends HttpServlet{

	
	private static final long serialVersionUID = -3530598956069462773L;
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");
		String name=req.getParameter("fullname");
		String sdt=req.getParameter("phone");
		String pass=req.getParameter("pass");
		String roleid=req.getParameter("roleid");
		AccountDAO Asdao=new AccountDAO();
		try {
			Asdao.AddAccount(name, sdt, pass, roleid);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	
		resp.sendRedirect("adminAcccount");
	}
}
