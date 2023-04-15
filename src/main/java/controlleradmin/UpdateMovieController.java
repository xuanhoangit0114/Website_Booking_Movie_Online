package controlleradmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MovieDAO;

@WebServlet(urlPatterns = "/update_movie")
public class UpdateMovieController extends HttpServlet {
	private static final long serialVersionUID = 3258591526426316326L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		MovieDAO mdao = new MovieDAO();
		String mid = req.getParameter("mid");
		String name_movie = req.getParameter("name_movie");
		String image = req.getParameter("image");
		String decription = req.getParameter("description");
		String totaltime = req.getParameter("total_time");
		String actor = req.getParameter("actors");
		String director = req.getParameter("director");
		String languege = req.getParameter("language");
		String date = req.getParameter("date");
		String long_decription = req.getParameter("long_decrip");
		String banner=req.getParameter("banner");
		mdao.EditMovie(name_movie, image, decription, totaltime, actor, director, languege, date,long_decription,banner, mid);
		System.out.println("duoc roi ne!!");
		resp.sendRedirect("adminMovie");
	}

}
