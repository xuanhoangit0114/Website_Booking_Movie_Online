package controlleradmin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.SeatDAO;

@WebServlet(urlPatterns = "/addseat")
public class AddSeatController extends HttpServlet {

	private static final long serialVersionUID = -882828201672918786L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");
		String Rid = req.getParameter("id_room");
		SeatDAO Sdao=new SeatDAO();
		String name_seat=req.getParameter("name_seat");
		Sdao.AddSeatFromRoom(name_seat, "0", Rid);
		resp.sendRedirect("adminRoom");
		
	}
}
