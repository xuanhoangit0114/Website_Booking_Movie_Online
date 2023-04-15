package controlleradmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.RoomDAO;
import DAO.SeatDAO;
@WebServlet(urlPatterns="/deleteRoom")
public class DeleteRoomController extends HttpServlet{

	private static final long serialVersionUID = -6583634427859580564L;
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 String Rid=req.getParameter("Rid");
		RoomDAO Rdao=new RoomDAO();
		SeatDAO Sdao=new SeatDAO();
		Rdao.deleteRoom(Rid);
		Sdao.deleteSeatFromRoom(Rid);
		resp.sendRedirect("adminRoom");
}
}
