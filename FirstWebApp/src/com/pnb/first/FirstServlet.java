package com.pnb.first;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Init called");
		System.out.println("call destroy");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		String password = request.getParameter("pass");
		RequestDispatcher dispatcher;

		if (username != null && password != null) {
			try {
				if (username.equalsIgnoreCase("Mounika") && password.equalsIgnoreCase("Test")) {
					request.setAttribute("user", username);
					dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/success.jsp");
					dispatcher.forward(request, response);
				} else {
					dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/failure.jsp");
					dispatcher.forward(request, response);
				}
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		super.service(arg0, arg1);
		System.out.println("Service Method Called");
	}
	
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("Destory called");
	}

}
