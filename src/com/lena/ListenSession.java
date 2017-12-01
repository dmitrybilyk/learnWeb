package com.lena;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by dmitry on 30.11.17.
 */
public class ListenSession implements HttpSessionListener {
    private int sessionCount;
    public ListenSession () {
        this.sessionCount = 0;
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        session.setMaxInactiveInterval(60);
        sessionCount++;
        System.out.println("Session get started");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        System.out.println("Session"+sessionCount+"destroyed");
    }
}
