package com.kg.testjsfa8h4.servlet.employe;

import com.kg.testjsfa8h4.beans.EmployesBean;
import com.kg.testjsfa8h4.beans.Form1Bean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author esyrygin
 */
@WebServlet(name = "addemployesave", urlPatterns = {"/addemployesave"})
public class addemployesave extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8"); 
        PrintWriter out = response.getWriter();
        try {
            Integer fid = Integer.valueOf(request.getParameter("fid"));
            String fio = request.getParameter("fio");
            String hphone = request.getParameter("hphone");
            String mphone = request.getParameter("mphone");
            String wphone = request.getParameter("wphone");
            String haddress = request.getParameter("haddress");
            String email = request.getParameter("email");
            String bankr = request.getParameter("bankr");
            String position = request.getParameter("position");
            
            Form1Bean f1Bean = new Form1Bean();
            
            EmployesBean employesBean = new EmployesBean();
            employesBean.setBankDetails(bankr);
            employesBean.setFio(fio);
            employesBean.setHomeAddress(haddress);
            employesBean.setForm1(f1Bean.returnForm1ById(fid));
            employesBean.setMail(email);
            employesBean.setPhoneHome(hphone);
            employesBean.setPhoneMobile(mphone);
            employesBean.setPhoneWork(wphone);
            employesBean.setPosition(position);
            
            employesBean.addEmploye();
            
            response.sendRedirect("employees.jsp");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
