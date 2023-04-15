package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.ScheduleDAO;
import model.Schedule;
import model.Time;

@WebServlet(urlPatterns = "/choose_time")
public class ChooseTimeController extends HttpServlet {

	private static final long serialVersionUID = 9027831544555710310L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		ScheduleDAO schedao = new ScheduleDAO();
		Schedule schedule;
		String DateID = req.getParameter("Date_id");
		HttpSession ses = req.getSession();
		try {
			List<Schedule> listdate = schedao.getDate();
			req.setAttribute("listDates", listdate);
			List<Time> listtime_on_movie = schedao.getListTimeByID(DateID);
			schedule=schedao.getDateByID(DateID);
			req.setAttribute("listStartTimes", listtime_on_movie);
			ses.setAttribute("date", schedule);
		} catch (Exception e) {
			e.printStackTrace();
		}
		req.getRequestDispatcher("/views/client/choose_time.jsp").forward(req, resp);
	}
}
