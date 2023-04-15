package controlleradmin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.AccountDAO;
import model.AccountS;
@WebServlet(urlPatterns=("/adminAcccount"))
public class AdminAccountController extends HttpServlet {
	private static final long serialVersionUID = -7019439334142469917L;
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	 resp.setContentType("text/html;charset=UTF-8");
 		req.setCharacterEncoding("UTF-8");
 		AccountDAO AccDao=new AccountDAO();
 		List<AccountS> Listacc;
		try {
			Listacc = AccDao.getListAcc();
			req.setAttribute("listacc", Listacc);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
 		req.getRequestDispatcher("views/admin/account.jsp").forward(req, resp);
    }
}
