package controlleradmin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MovieDAO;
import model.Movies;
@WebServlet(urlPatterns="/adminMovie")
public class AdminMovieController extends HttpServlet{
	private static final long serialVersionUID = 4169329832698365011L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		 MovieDAO mvdao=new MovieDAO();
		List<Movies> listmv;
		try {
			listmv = mvdao.getListMovie();
			req.setAttribute("listmovie", listmv);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		req.getRequestDispatcher("/views/admin/Movie.jsp").forward(req, resp);
    }
}
