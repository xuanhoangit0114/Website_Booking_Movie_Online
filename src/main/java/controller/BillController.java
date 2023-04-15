package controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.TicketDAO;
import model.AccountS;
import model.Seats;
import model.Ticket;
@WebServlet(urlPatterns="/bill")
public class BillController extends HttpServlet{

	private static final long serialVersionUID = -3342420222919533801L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	TicketDAO dao=new TicketDAO();
        HttpSession ses=req.getSession();
        AccountS acc=(AccountS) ses.getAttribute("acc");
        Long acc_id=acc.getId();
    	int toltalmony=0;
    	int singleticket=0;
    	try {
			List<Ticket> listicket=dao.getListTicketBYID(acc_id);
			req.setAttribute("listticket", listicket);	
			ses.setAttribute("user", listicket);
			Seats seat=(Seats) ses.getAttribute("seat");
			for(Ticket ticket: listicket) {
				singleticket=Integer.parseInt(ticket.getPrice());
				toltalmony+=singleticket++;
				String.valueOf(toltalmony);
			}
			int moneysingleticket=singleticket-1;
			ses.setAttribute("toltal", toltalmony);
			ses.setAttribute("singleticket", moneysingleticket);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	req.getRequestDispatcher("/views/client/Bill.jsp").forward(req, resp);
    }
}
