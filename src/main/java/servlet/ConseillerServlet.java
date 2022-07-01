package servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Conseiller;
import service.ConseillerService;

@WebServlet("/ConseillerServlet")
public class ConseillerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ConseillerService service = new ConseillerService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(Integer.parseInt(request.getParameter("id")));
		Conseiller c = service.getConseiller(Integer.parseInt(request.getParameter("id")));
		request.setAttribute("c", c);
		RequestDispatcher disp = request.getRequestDispatcher("gestionConseiller.jsp");
		disp.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if(request.getParameter("supprimer") != null) {
			service.deleteConseiller(Integer.parseInt(request.getParameter("idC")) );
		} else if(request.getParameter("modifier") != null) {
			Conseiller c = new Conseiller();
			c.setName(request.getParameter("name"));
			c.setFirstName(request.getParameter("firstname"));
			c.setDob(LocalDate.parse( request.getParameter("dob")));
			c.setSalary(Integer.parseInt(request.getParameter("salary")));
			service.updateConseiller(c, Integer.parseInt(request.getParameter("idC")) );
		}
		response.sendRedirect("/TpConseiller/MainServlet");
//		RequestDispatcher disp = request.getRequestDispatcher("index.jsp");
//		disp.forward(request, response);
	}

}
