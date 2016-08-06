package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Health;
import model.HealthCheckLogic;

/**
 * Servlet implementation class HealthCheck
 */
@WebServlet("/HealthCheck")
public class HealthCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		//forward
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/healthCheck.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);

		//get Request Parameter
		String weight = request.getParameter("weight");
		String height = request.getParameter("height");

		//set input to Property
		Health health = new Health();
		health.setHeight(Double.parseDouble(height));
		health.setWeight(Double.parseDouble(weight));

		//execute HealthCheck and set result
		HealthCheckLogic healthCheckLogic = new HealthCheckLogic();
		healthCheckLogic.execute(health);

		//save to request scope
		request.setAttribute("health", health);

		//forward
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/healthCheckResult.jsp");
		dispatcher.forward(request, response);
	}
}
