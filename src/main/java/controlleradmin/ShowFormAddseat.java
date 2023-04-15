package controlleradmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.RoomDAO;
import model.Rooms;
@WebServlet(urlPatterns = "/show_form_seat")
public class ShowFormAddseat extends HttpServlet{

	private static final long serialVersionUID = 6406861155987720689L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	HttpSession ses1=req.getSession(); 
    	 RoomDAO Rdao=new RoomDAO();
    	 Rooms room;
    	 String Rid = req.getParameter("id_room");
    	 try {
			room=Rdao.getRoomBYID(Rid);
			ses1.setAttribute("room", room);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
    	
    	
    	req.getRequestDispatcher("/views/admin/addseat.jsp").forward(req, resp);
    }
}
