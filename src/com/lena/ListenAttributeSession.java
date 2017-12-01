package com.lena;

import javax.servlet.http.*;

/**
 * Created by dmitry on 30.11.17.
 */
public class ListenAttributeSession implements HttpSessionAttributeListener {

    public ListenAttributeSession() {
        System.out.println(getClass().getName());
    }


    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
        String b = "add";
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {

    }
}
