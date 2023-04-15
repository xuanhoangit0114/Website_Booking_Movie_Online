package controlleradmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.MovieDAO;
import model.Movies;
@WebServlet(urlPatterns="/editmovie")
public class EditMovieController extends HttpServlet{


	private static final long serialVersionUID = 8965235620548620426L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		MovieDAO mdao=new MovieDAO();
		String mid=req.getParameter("mid");
		HttpSession ses=req.getSession();
		try {
			Movies tmv=mdao.getMovieByID(mid);
			req.setAttribute("listmovie1", tmv);
			ses.setAttribute("movie", tmv);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		req.getRequestDispatcher("/views/admin/EditMovie.jsp").forward(req, resp);
	}
	

}
