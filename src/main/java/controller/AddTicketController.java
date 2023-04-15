package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.SeatDAO;
import DAO.TicketDAO;
import model.AccountS;
import model.Movies;
import model.Rooms;
import model.Schedule;
import model.Seats;import model.Ticket;
import model.Time;
@WebServlet(urlPatterns="/check_ticket")
public class AddTicketController extends HttpServlet{
	private static final long serialVersionUID = -3342420222919533801L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Cseats=req.getParameter("seats1");
		Seats seat;
		SeatDAO Sedao=new SeatDAO();
		HttpSession sess=req.getSession();
		TicketDAO ticketdao=new TicketDAO();
		try {
			seat=Sedao.getSeatsBYID(Cseats);
			sess.setAttribute("seat", seat);
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			DateTimeFormatter dtftime = DateTimeFormatter.ofPattern("HH:mm:ss"); 
			   LocalDateTime now = LocalDateTime.now(); 
	    	 AccountS user= (AccountS) sess.getAttribute("acc");	
	    	 Movies movie=(Movies) sess.getAttribute("tenphim");   
	    	 Seats seat1=(Seats) sess.getAttribute("seat"); 
	    	 Rooms room=(Rooms) sess.getAttribute("room");	    
	    	 Schedule sche=(Schedule) sess.getAttribute("date");    	
	    	 Time time=(Time) sess.getAttribute("time");
	         int price=55000;
	         req.setAttribute("money", price);
	         TicketDAO tdao=new TicketDAO();
			  if(sess.getAttribute("seat")!= null) {
					ticketdao.Getdata(user.getId(), user.getFullname(), movie.getTittle(), sche.getDate(),
					time.getTime(), room.getRoom_name(), seat1.getSeat_name(), dtf.format(now),price,seat1.getId(),movie.getId(),dtftime.format(now));
			  }
			  if(seat1!=null) {
				  tdao.SetstatusChoese(Cseats);
			  }
				Ticket ticket_unchoose=(Ticket) sess.getAttribute("ticketdel");
			 if(ticket_unchoose!= null) {
				 tdao.SetstatusUnchose(Cseats);
			 };
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		} catch (SQLException e) {		
		}
		RequestDispatcher rd=req.getRequestDispatcher("views/client/checkinforticket.jsp");
		rd.forward(req, resp);
	} 
}
