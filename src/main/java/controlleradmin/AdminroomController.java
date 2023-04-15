package controlleradmin;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.RoomDAO;
import model.Rooms;
@WebServlet(urlPatterns="/adminRoom")
public class AdminroomController  extends HttpServlet{
	
	private static final long serialVersionUID = -5348776879663314330L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		RoomDAO Rdao=new RoomDAO();
		List<Rooms> listRoom;
		try {
			listRoom = Rdao.getListRoom();
			req.setAttribute("listroom", listRoom);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		req.getRequestDispatcher("/views/admin/Room.jsp").forward(req, resp);
    }
}

