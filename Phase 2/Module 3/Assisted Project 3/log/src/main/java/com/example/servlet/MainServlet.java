package com.example.servlet;

import com.example.model.YourEntity;
import com.example.util.HibernateUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/main")
public class MainServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        YourEntity entity = new YourEntity();
        entity.setId(3);
        entity.setName("virat");

        HibernateUtil.saveEntity(entity);

        response.getWriter().println("Entity saved successfully!");
    }
}
