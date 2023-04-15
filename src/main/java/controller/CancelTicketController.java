package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.TicketDAO;
import model.Seats;
@WebServlet(urlPatterns = "/cancelticket")
public class CancelTicketController extends HttpServlet {
	private static final long serialVersionUID = -3566713476775043143L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String ticket_id = req.getParameter("ticket_id");
		HttpSession ses=req.getSession();
		ses.getAttribute("acc");
		Seats seat=(Seats) ses.getAttribute("seat");
		String check1=Long.toString(seat.getId());
		TicketDAO dao = new TicketDAO();
		try {
			dao.deleleTicket(ticket_id);
			System.out.println(seat);
			dao.SetstatusUnchose(check1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		resp.sendRedirect("bill");
	}

}
