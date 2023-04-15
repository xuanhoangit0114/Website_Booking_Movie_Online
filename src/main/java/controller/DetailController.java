package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.MovieDAO;
import model.Movies;
@WebServlet(urlPatterns="/show-movie")
public class DetailController extends HttpServlet {
	private static final long serialVersionUID = -6340957825930354809L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MovieDAO mvdao = new MovieDAO();
		String MID = req.getParameter("Mid");
		HttpSession ses=req.getSession();
		try {
		
			Movies tmv = mvdao.getMovieByID(MID);
			req.setAttribute("listmovie", tmv);
			ses.setAttribute("movie", tmv);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		RequestDispatcher rd = req.getRequestDispatcher("/views/client/movie-details.jsp");
		rd.forward(req, resp);
	}

}
