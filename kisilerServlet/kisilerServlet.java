package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class kisilerServlet
 */
@WebServlet("/kisilerServlet")
public class kisilerServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public kisilerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html><html><head>" +
				"</head><body>");
		
		ogrenci ogr = new ogrenci();
		
		ogr.Ad = "Eldar";
		ogr.Soyad = "Fayzulov";
		ogr.Tc = "1234567890";
		ogr.D_Tarihi = "01.10.1988";
		ogr.OgrenciNo = 9060527;
		ogr.Bolum = "Bilgisayar Müh.";
		ogr.Sinifi = "4";
		
		out.println("<div>Öğrenci");
		out.println("<ul>");
		out.println("<li> Ad : " + ogr.Ad + "</li>" +
					"<li> Soyad : " + ogr.Soyad + "</li>" +
					"<li> TC : " + ogr.Tc + "</li>" +
					"<li> Doğum Tarihi : " + ogr.D_Tarihi + "</li>" +
					"<li> Öğrenci No : " + ogr.OgrenciNo + "</li>" +
					"<li> Bölümü : " + ogr.Bolum + "</li>" +
					"<li> Sınıfı : " + ogr.Sinifi + "</li>"
					);
		out.println("</div>");
		
		hoca hoca = new hoca();
		
		hoca.Ad = "Ali";
		hoca.Soyad = "Veli";
		hoca.Tc = "8374920174";
		hoca.D_Tarihi = "12.10.1958";
		hoca.Sicil_No = 1243;
		
		out.println("<div>Hoca");
		out.println("<ul>");
		out.println("<li> Ad : " + hoca.Ad + "</li>" +
				"<li> Soyad : " + hoca.Soyad + "</li>" +
				"<li> TC : " + hoca.Tc + "</li>" +
				"<li> Doğum Tarihi : " + hoca.D_Tarihi + "</li>" +
				"<li> Sicil No : " + hoca.Sicil_No + "</li>"
				);
		out.println("</div>");
		
		memur mem = new memur();
		
		mem.Ad = "Hasan";
		mem.Soyad = "Hüseyin";
		mem.D_Tarihi = "24.06.1962";
		mem.Tc = "2943853905";
		mem.Birim = "Tahakkuk";
		mem.M_SicilNo = 9486;
		
		out.println("<div>Memur");
		out.println("<ul>");
		out.println("<li> Ad : " + mem.Ad + "</li>" +
				"<li> Soyad : " + mem.Soyad + "</li>" +
				"<li> TC : " + mem.Tc + "</li>" +
				"<li> Doğum Tarihi : " + mem.D_Tarihi + "</li>" +
				"<li> Birim : " + mem.Birim + "</li>" +
				"<li> Sicil No : " + mem.M_SicilNo + "</li>"
				);
		out.println("</div>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
