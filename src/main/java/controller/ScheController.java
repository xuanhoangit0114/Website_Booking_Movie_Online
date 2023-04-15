package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.MovieDAO;
import DAO.ScheduleDAO;
import model.Movies;
import model.Schedule;

@WebServlet(urlPatterns = "/chose_day")
public class ScheController extends HttpServlet {

	
	private static final long serialVersionUID = 6062504636337134292L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		ScheduleDAO schedao = new ScheduleDAO();
		Movies movie;
		MovieDAO dao = new MovieDAO();
		String id_movie=req.getParameter("movie_id");
		HttpSession ses=req.getSession();
		try {
			
			movie=dao.getMovieByID(id_movie);
			List<Schedule> listdate = schedao.getDate();
			req.setAttribute("listDates", listdate);
			ses.setAttribute("tenphim", movie);
		} catch (Exception e) {
			e.printStackTrace();
		}
		req.getRequestDispatcher("/views/client/schedule.jsp").forward(req, resp);
	}

}
