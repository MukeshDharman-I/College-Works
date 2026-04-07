
package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ClientServlet")
public class ClientServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response, String method)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String service = request.getParameter("service");
        String issue = request.getParameter("issue");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Smart City Response</title>");

        out.println("<style>");
        out.println("body { font-family: Arial; background: linear-gradient(135deg,#0f2027,#203a43,#2c5364); color:white; display:flex; justify-content:center; align-items:center; height:100vh; }");
        out.println(".container { background:#1c2b36; padding:30px; border-radius:12px; box-shadow:0 0 20px #00f7ff; text-align:center; width:400px; }");
        out.println("h1 { color:#00f7ff; margin-bottom:20px; }");
        out.println("p { font-size:18px; margin:10px 0; }");
        out.println("a { display:inline-block; margin-top:20px; text-decoration:none; color:black; background:#00f7ff; padding:10px 20px; border-radius:8px; font-weight:bold; }");
        out.println("a:hover { background:#00ff88; }");
        out.println("</style>");

        out.println("</head><body>");
        out.println("<div class='container'>");

        out.println("<h1>🌆 Smart City Request</h1>");
        out.println("<p><strong>Name:</strong> " + (name != null ? name : "Not Provided") + "</p>");
        out.println("<p><strong>Service:</strong> " + (service != null ? service : "Not Provided") + "</p>");
        out.println("<p><strong>Issue:</strong> " + (issue != null ? issue : "Not Provided") + "</p>");

        out.println("<p>Request submitted via " + method + "</p>");
        out.println("<p>Our Smart City team will resolve it soon 🚀</p>");

        out.println("<a href='index.html'>Go Back</a>");

        out.println("</div></body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response, "GET");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response, "POST");
    }
}
