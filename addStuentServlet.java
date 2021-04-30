package com.jiaying.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiaying.Student.Student;
import com.jiaying.service.StudentService;

/**
 * Servlet implementation class addStuentServlet
 */
public class addStuentServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	 int Sno= Integer.parseInt(request.getParameter("Sno"));
	 String Sname= request.getParameter("Sname");
	 int Sage=Integer.parseInt( request.getParameter("Sage"));
	 String Saddress= request.getParameter("Saddress");
	  Student  student= new Student(Sno,Sname,Sage,Saddress);
	 // System.out.println("输入成功");
	 // System.out.println(student.getSname());
	  
	  
	  
	   StudentService service=new StudentService();
	   
	   boolean result= service.addStudent(student);
	   response.setContentType("text/html; charset=UTF-8");
	   response.setCharacterEncoding("utf-8");
	   PrintWriter out = response.getWriter();
	   if(result) {
		
		  out.print("增加成功");
	   }else {
		out.print("此同学已经存在");
	}
	  
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
