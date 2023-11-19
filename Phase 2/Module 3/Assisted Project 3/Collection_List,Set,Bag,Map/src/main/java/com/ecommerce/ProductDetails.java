package com.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ProductDetails extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ProductDetails() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            List<EProduct> list = session.createQuery("from EProduct", EProduct.class).list();
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<b>Product Listing</b><br>");
            for (EProduct p : list) {
                out.println("ID: " + String.valueOf(p.getID()) + ", Name: " + p.getName() + ", Price: "
                        + String.valueOf(p.getPrice()));
                List<Color> colors = p.getColors();
                out.println("Colors: ");
                for (Color c : colors) {
                    out.print(c.getName() + "&nbsp;");
                }
                Collection<ScreenSizes> sizes = p.getScreensizes();
                out.println(", Screen Sizes: ");
                for (ScreenSizes s : sizes) {
                    out.print(s.getSize() + "&nbsp;");
                }
                Set<OS> os = p.getOs();
                out.println(", OS : ");
                for (OS o : os) {
                    out.print(o.getName() + "&nbsp;");
                }
                Map finances = p.getFinance();
                out.println(", Finance Options: ");
                if (finances.get("CREDITCARD") != null) {
                    Finance f = (Finance) finances.get("CREDITCARD");
                    out.println(f.getName() + " &nbsp;");
                }
                if (finances.get("BANK") != null) {
                    Finance f = (Finance) finances.get("BANK");
                    out.println(f.getName() + " &nbsp;");
                }
                out.println("<hr>");
            }
            session.close();
            out.println("</body></html>");
        } catch (Exception ex) {
            throw new ServletException(ex);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
