package controlleradmin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.MovieDAO;
@WebServlet("/addmovie")
public class AddMovieController extends HttpServlet {

	private static final long serialVersionUID = -2230882190666113226L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8"); //truyền dữ liệu dạng encode UTF-8
		String name_movie=req.getParameter("name_movie");
		String image=req.getParameter("image");
		String decription=req.getParameter("description");
		String totaltime=req.getParameter("total_time");
		String actor=req.getParameter("actors");
		String director=req.getParameter("director");
		String languege=req.getParameter("language");
		String date=req.getParameter("date");
		String long_decription = req.getParameter("long_decrip");
		String banner=req.getParameter("banner");
		MovieDAO dao=new MovieDAO();
		dao.AddMovie(name_movie, image, decription, totaltime, actor, director, languege, date,long_decription,banner);
		resp.sendRedirect("adminMovie");
	}

}
