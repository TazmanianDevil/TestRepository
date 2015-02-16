package com.kia.clients;

import com.kia.MySessionBeanLocal;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Musin on 16.02.2015.
 */
@javax.servlet.annotation.WebServlet(name = "LocalClientServlet", urlPatterns = "/LocalClient")

public class LocalClientServlet extends javax.servlet.http.HttpServlet {
    @EJB
    MySessionBeanLocal bean;
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.println("Это сервлет-локальный клиент! Метод doPost!");
        out.println("Доступ к бину: " + bean.getName());
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.println("Это сервлет-локальный клиент! Метод doGet!");
        out.println("Доступ к бину: " + bean.getName());
    }
}
