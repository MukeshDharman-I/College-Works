{\rtf1\ansi\ansicpg1252\cocoartf2868
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica-Bold;\f1\fnil\fcharset0 AppleColorEmoji;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl278\slmult1\sa160\partightenfactor0

\f0\b\fs18 \cf2 package com.example;\
\
import java.io.IOException;\
import java.io.PrintWriter;\
import javax.servlet.ServletException;\
import javax.servlet.annotation.WebServlet;\
import javax.servlet.http.HttpServlet;\
import javax.servlet.http.HttpServletRequest;\
import javax.servlet.http.HttpServletResponse;\
\
@WebServlet("/ClientServlet")\
public class ClientServlet extends HttpServlet \{\
    private static final long serialVersionUID = 1L;\
\
    protected void doPost(HttpServletRequest request, HttpServletResponse response)\
            throws ServletException, IOException \{\
\
        String name = request.getParameter("name");\
        String service = request.getParameter("service");\
        String issue = request.getParameter("issue");\
\
        response.setContentType("text/html");\
        PrintWriter out = response.getWriter();\
\
        out.println("<html>");\
        out.println("<head><title>Smart City Response</title>");\
\
        out.println("<style>");\
        out.println("body \{ font-family: Arial; background: #0f2027; color: white; display:flex; justify-content:center; align-items:center; height:100vh; \}");\
        out.println(".box \{ background:#1c2b36; padding:30px; border-radius:10px; box-shadow:0 0 20px #00f7ff; text-align:center; width:400px; \}");\
        out.println("h1 \{ color:#00f7ff; \}");\
        out.println("a \{ display:inline-block; margin-top:15px; color:black; background:#00f7ff; padding:10px 20px; text-decoration:none; border-radius:6px; \}");\
        out.println("</style>");\
\
        out.println("</head>");\
        out.println("<body>");\
\
        out.println("<div class='box'>");\
        out.println("<h1>
\f1\b0 \uc0\u9989 
\f0\b  Request Submitted</h1>");\
        out.println("<p>Hello <b>" + name + "</b></p>");\
        out.println("<p>Your request for <b>" + service + "</b> has been received.</p>");\
        out.println("<p><b>Issue:</b> " + issue + "</p>");\
        out.println("<p>Our Smart City team will resolve it soon 
\f1\b0 \uc0\u55357 \u56960 
\f0\b </p>");\
        out.println("<a href='index.html'>Go Back</a>");\
        out.println("</div>");\
\
        out.println("</body>");\
        out.println("</html>");\
    \}\
\}\
}