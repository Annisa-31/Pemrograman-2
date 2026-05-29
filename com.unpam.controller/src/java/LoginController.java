/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unpam.controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author Annisa Zahra Zahira
 */
public class LoginController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try (PrintWriter out = response.getWriter()) {

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Login</title>");
            out.println("</head>");
            out.println("<body>");

            if (username == null && password == null) {

                out.println("<h1>Form Login</h1>");

                out.println("<form method='post'>");

                out.println("Username : <br>");
                out.println("<input type='text' name='username'><br><br>");

                out.println("Password : <br>");
                out.println("<input type='password' name='password'><br><br>");

                out.println("<input type='submit' value='Login'>");

                out.println("</form>");

            } else {

                if (username.equals("admin") && password.equals("123")) {

                    HttpSession session = request.getSession();
                    session.setAttribute("username", username);

                    out.println("<h2>Login Berhasil</h2>");
                    out.println("<a href='LogoutController'>Logout</a>");

                } else {

                    out.println("<h2>Login Gagal</h2>");
                    out.println("<a href='LoginController'>Kembali Login</a>");
                }
            }

            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}