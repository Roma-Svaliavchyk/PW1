package com.vmwork.pw1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "listServlet", value = "/list-Servlet")
public class ListServlet extends HttpServlet {

  public void init() {
  }

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html");

    List<Product> products = new ArrayList<>();
    products.add(new Product(1, "RTX 3060 ti", 20000f));
    products.add(new Product(2, "RTX 3060 ", 17000f));
    products.add(new Product(3, "RTX 3050 ti", 17500f));
    products.add(new Product(4, "RTX 2060 ti", 15000f));
    products.add(new Product(5, "RTX 1050", 12000f));
    products.add(new Product(6, "RTX 1050 ti", 14000f));
    products.add(new Product(7, "RTX 1060", 13000f));
    products.add(new Product(8, "RTX 1060 ti", 16000f));
    products.add(new Product(9, "RTX 3050 ", 14000f));
    products.add(new Product(10, "GTX 1660", 13000f));
    PrintWriter out = response.getWriter();
    out.println("<html><body>");
    out.println("<ul>");
    products.forEach(product -> {
      out.println("<li>" + product.getTitle() + " Ціна: " + product.getCost() + "</li>");
    });
    out.println("</ul>");
    out.println("</body></html>");
  }

  public void destroy() {
  }

}
