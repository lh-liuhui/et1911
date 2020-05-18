package com.etoak.contorller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

public class HelloContorller implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//接受参数
		String name=request.getParameter("name"); 
		System.out.println("param name -"+name);
		//调用service，向request传值
		request.setAttribute("result", "Hello" +name);
		//返回页面
		request.getRequestDispatcher("/hello.jsp").forward(request, response);
	}

}
