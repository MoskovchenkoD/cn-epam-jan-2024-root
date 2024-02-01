package com.task02.dto;

public class HelloResponse {
    private int statusCode;
    private HelloBody body;
    
    public HelloResponse(
        int statusCode,
        HelloBody body) {
        this.statusCode = statusCode;
        this.body = body;
    }
    
    public HelloResponse() {
    }
    
    public int getStatusCode() {
        return statusCode;
    }
    
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
    
    public HelloBody getBody() {
        return body;
    }
    
    public void setBody(HelloBody body) {
        this.body = body;
    }
}
