package controlleradmin;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import DAO.AccountDAO;
import DAO.TicketDAO;
import model.AccountS;
import model.Ticket;

@WebServlet(urlPatterns = "/home_admin")
public class HomeAdminController extends HttpServlet {
	private static final long serialVersionUID = -1098546503101395305L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		req.getRequestDispatcher("/views/admin/home.jsp").forward(req, resp);
		AccountDAO AccDao = new AccountDAO();
		TicketDAO ticketdao = new TicketDAO();
		List<Ticket> listicket;
		List<Ticket> listPrice;
		List<AccountS> Listacc;
		int count = 0;
		String date = "28/03/2023";
		String getMoney = null;
		int countnumber = 0;
		int earnmoneyday = 0;
		HttpSession session = req.getSession();
		try {
			listPrice = ticketdao.getpriceBydate(date);
			for (Ticket t : listPrice) {
				getMoney = t.getPrice();
				countnumber = Integer.parseInt(getMoney);
				earnmoneyday += countnumber++;

			}
			Locale localeVN = new Locale("vi", "VN");
			NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
			String moneytostring = currencyVN.format(earnmoneyday);

			listicket = ticketdao.gettotalticket();
			Listacc = AccDao.getListAcc();
			session.setAttribute("toltalearnmoney_day", moneytostring);
			session.setAttribute("toltalticket", listicket.size());
			for (AccountS acc : Listacc) {
				if (acc.getRoleid() == 0) {
					count++;
				}
				session.setAttribute("listsize", count);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
