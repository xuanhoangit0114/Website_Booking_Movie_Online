package controlleradmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.RoomDAO;
@WebServlet("/addroom")
public class AddRoomController extends HttpServlet{

	private static final long serialVersionUID = -8933573172669019506L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");
		String name_room=req.getParameter("name_room");
		String capa=req.getParameter("capa");
		RoomDAO Rdao=new RoomDAO();
		Rdao.AddRoom(name_room, capa);
	
		resp.sendRedirect("adminRoom");
	}

}
