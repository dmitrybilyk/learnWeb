//package com.lena.httpclient;
//
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.impl.client.HttpClientBuilder;
//
//import java.util.Map;
//
///**
// * Created by dmitry on 02.11.17.
// */
//public class PostBeanClass {
//    private Map parameters;
//    private String url;
//
//    public Map getParameters() {
//        return parameters;
//    }
//
//    public void setParameters(Map parameters) {
//        this.parameters = parameters;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public void getPost() {
//        HttpClient client = HttpClientBuilder.create().build();
//        HttpPost post = new HttpPost(url);
//    }
//}
