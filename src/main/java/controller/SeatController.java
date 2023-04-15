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
import DAO.SeatDAO;
import model.Rooms;
import model.Seats;
@WebServlet(urlPatterns ="/infor_seat")
public class SeatController extends HttpServlet {

	private static final long serialVersionUID = 3104655315698371733L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  resp.setContentType("text/html;charset=UTF-8");
		   SeatDAO Sdao=new SeatDAO();
		   String RoomID=req.getParameter("Rid");
		   Rooms room;
		   RoomDAO Rdao=new RoomDAO();
		   HttpSession ses1=req.getSession();
		   try {
		    room=Rdao.getRoomBYID(RoomID);
			List<Seats> listseat=Sdao.getListSeatsBYID(RoomID);
			req.setAttribute("listSeat", listseat);		
			ses1.setAttribute("room", room);
			int a=(int) ses1.getAttribute("singleticket");
			ses1.setAttribute("ok", a);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		   RequestDispatcher rd=req.getRequestDispatcher("/views/client/seats.jsp");
			rd.forward(req, resp);
		
	}
}
