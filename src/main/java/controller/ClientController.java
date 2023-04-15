package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MovieDAO;
import model.Movies;

@WebServlet(urlPatterns = { "/trangchu" })
public class ClientController extends HttpServlet {

	private static final long serialVersionUID = 1255618715659674027L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		MovieDAO mvdao = new MovieDAO();
		try {
			List<Movies> listmv = mvdao.getListMovie();
			req.setAttribute("listmovie", listmv);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		RequestDispatcher rd = req.getRequestDispatcher("/views/client/home.jsp");
		rd.forward(req, resp);
	}
}
