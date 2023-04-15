package controlleradmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MovieDAO;
@WebServlet(urlPatterns="/delete")
public class DeletedMovieController extends HttpServlet{

	private static final long serialVersionUID = -8310329828660239414L;
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String Mid=req.getParameter("mid");
	MovieDAO dao=new MovieDAO();
	dao.deleteMovie(Mid);
	resp.sendRedirect("adminMovie");
}
}
