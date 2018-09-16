package org.injae.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("HelloServlet service()........");

        req.setAttribute("msg","안녕세상아.");

        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);

        req.setAttribute("tName",threadName);

        List<String> list = new ArrayList<>();
        list.add("AAAA");
        list.add("BBBB");
        list.add("CCCC");

        req.setAttribute("list",list);

        RequestDispatcher dispatcher =
                req.getRequestDispatcher("/WEB-INF/hello.jsp"); // 내부(서블릿)에서 jsp(web-inf)로 배포

        dispatcher.forward(req,resp);   //
        // 서블릿에서 저장된 것들을 다 지움. 이유: jsp에서 다시저장하기떄문에

    }
}
