package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.RoomDAO;
import DAO.ScheduleDAO;
import model.Rooms;
import model.Time;

@WebServlet(urlPatterns = "/infor_room")
public class RoomController extends HttpServlet {

	private static final long serialVersionUID = -2279755986309106687L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		Time time;
		String time_id=req.getParameter("Time_id");
		ScheduleDAO Sdao=new ScheduleDAO();
		RoomDAO Rdao = new RoomDAO();
		HttpSession ses=req.getSession();
		try {
			
			List<Rooms> listroom = Rdao.getListRoom();
			time=Sdao.getTimeByID(time_id);
			req.setAttribute("listRooms", listroom);
			ses.setAttribute("time", time);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = req.getRequestDispatcher("/views/client/room.jsp");
		rd.forward(req, resp);

	}
}
