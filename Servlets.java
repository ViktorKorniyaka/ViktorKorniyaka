import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import java.util.*;


public class Servlets extends HttpServlet {
	
	public void doGet (HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
		responce.setContentType("text/html");
		
		PrintWriter pr = responce.getWriter();
		pr.println("Hallo World");
		pr.close();
	}

}
