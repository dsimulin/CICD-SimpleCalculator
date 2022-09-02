/*
 * Simple calculator
 */
package simple;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @original_idea_author GAURAV
 */
public class calculator extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
              PrintWriter out = response.getWriter();
                String var1 = request.getParameter("var1");
                String var2 = request.getParameter("var2");
                String calculate = request.getParameter("calculate"); 
               
                
                if(calculate.equals("Addition")){
                     out.println((Integer.parseInt(var1) + Integer.parseInt(var2)));
                }
                else if(calculate.equals("Subtraction")){
                     out.println(Integer.parseInt(var1) - Integer.parseInt(var2));
                }
                else if(calculate.equals("Multiplication")){
                     out.println(Integer.parseInt(var1) * Integer.parseInt(var2));
                }
                else{
                    out.println(Integer.parseInt(var1) / Integer.parseInt(var2));
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
        return "Simple calculator";
    }// </editor-fold>

}
