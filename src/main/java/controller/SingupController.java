package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.AccountDAO;
import model.AccountS;

@WebServlet(urlPatterns = "/signup")
public class SingupController extends HttpServlet {
	private static final long serialVersionUID = 4575097519070812292L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8"); // Đây là câu lệnh quan trọng để lấy về dữ liệu
		String user_name = req.getParameter("user_name");
		String number_phoner = req.getParameter("phone_number");
		String password = req.getParameter("pass");
		String repass = req.getParameter("repass");
		AccountDAO Adao = new AccountDAO();
		try {
			AccountS a = Adao.CheckAccountSingup(number_phoner);
			if (a == null) {
				if (password.equals(repass)) {
					Adao.SignUp(user_name, number_phoner, password);
					req.setAttribute("mess3", "Đăng kí thành công!");
					req.getRequestDispatcher("/views/client/Login.jsp").forward(req, resp);
				} else {
					req.setAttribute("mess1", "Mật khẩu nhập lại không khớp!");
					req.getRequestDispatcher("/views/client/Login.jsp").forward(req, resp);
				}} 
			else{
				req.setAttribute("mess2", "tài khoản này đã có người khác đăng kí rồi!!");
				req.getRequestDispatcher("/views/client/Login.jsp").forward(req, resp);	}
			System.out.println(a);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}}
}
