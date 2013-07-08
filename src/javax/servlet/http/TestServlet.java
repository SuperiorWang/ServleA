package javax.servlet.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

public class TestServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response) ;
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Hello,this is a text");
		
		out.flush();
		out.close();
	}
	
	public void destroy()
	{
		System.err.println(getServletName()+"生命周期结束");  
	}
	
	public void init()throws ServletException
	{
		System.out.println(getServletName()+"执行初始化");
	}
}
