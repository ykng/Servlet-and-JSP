package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CounterServlet
 */
@WebServlet("/CounterServlet")
public class CounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 // private Integer count; // if using field

	/**
	 * @see Servlet#init(ServletConfig)
	 * if not using listener class, use this init() method.
	 */
	/*
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);

	//	count = 0 // if using field

		// if using field, delete this three context.
		Integer count = 0;
		ServletContext application = config.getServletContext();
		application.setAttribute("count", count);
	}
	*/

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destory() was executed");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		// if using field, delete this two context
		ServletContext application = this.getServletContext();
		Integer count = (Integer) application.getAttribute("count");
		count++;
		application.setAttribute("count", count);

		/*
		 * if not using filter, this context is need.
		 * response.setContentType("text/html; charset=UTF-8");
	   	*/
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Displaying the count of visit</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>count of visit:" + count + "</p>");
		out.println("<a href=\"/example/CounterServlet\">Update</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
