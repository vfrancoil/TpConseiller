package servlet;

import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Conseiller;
import service.ConseillerService;

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ConseillerService service = new ConseillerService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Conseiller> allConseiller = service.getAllConseiller();

        request.setAttribute("allConseiller", allConseiller);
		RequestDispatcher disp = request.getRequestDispatcher("index.jsp");
		disp.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("ajouter") != null) {
			Conseiller c = new Conseiller();
			c.setName(request.getParameter("name"));
			c.setFirstName(request.getParameter("firstName"));
			c.setDob(LocalDate.parse(request.getParameter("DOB")));
			c.setSalary(Integer.parseInt(request.getParameter("salary")));
			c.setDateCreation(LocalDate.now());
			c.setNumConseiller(generateNumClient());
			service.addConseiller(c);
		}
		doGet(request, response);
	}
  
	public String generateNumClient() {
		  int leftLimit = 48; // numeral '0'
		    int rightLimit = 122; // letter 'z'
		    int targetStringLength = 10;
		    Random random = new Random();

		    String generatedString = random.ints(leftLimit, rightLimit + 1)
		      .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
		      .limit(targetStringLength)
		      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
		      .toString();
	    return generatedString;
	}


}
