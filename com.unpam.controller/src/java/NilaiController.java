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

/**
 *
 * @author Annisa Zahra Zahira
 */
public class NilaiController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Input Nilai</title>");
            out.println("</head>");
            out.println("<body>");

            out.println("<h1>Input Nilai Mahasiswa</h1>");

            out.println("<form>");

            out.println("NIM : <input type='text'><br><br>");
            out.println("Nama : <input type='text'><br><br>");
            out.println("Kode MK : <input type='text'><br><br>");
            out.println("Nilai Tugas : <input type='text'><br><br>");
            out.println("Nilai UTS : <input type='text'><br><br>");
            out.println("Nilai UAS : <input type='text'><br><br>");

            out.println("<input type='submit' value='Simpan'>");

            out.println("</form>");

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