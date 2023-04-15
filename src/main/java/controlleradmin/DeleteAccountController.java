package controlleradmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.AccountDAO;
@WebServlet(urlPatterns="/deleteAccount")
public class DeleteAccountController extends HttpServlet{
	private static final long serialVersionUID = -4829934585337047024L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 String Aid=req.getParameter("Aid");
	 AccountDAO Adao=new AccountDAO();
	 Adao.DeleteAccout(Aid);
	 resp.sendRedirect("adminAcccount");
	}
}
