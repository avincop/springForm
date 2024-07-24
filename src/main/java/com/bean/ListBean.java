package com.bean;


import java.util.ArrayList;
import java.util.List;
 
public class ListBean {
    List<String> list = new ArrayList<String>();
    public List<String> getItems() {
        System.out.println("Done adding to list");
 
        list.add("Delhi");
        list.add("Jaipur");
        list.add("Goa");
 
        return list;
    }
    
    private String old_list = "No list message.";
    public String getSomething() {
        System.out.println("Get list");
       return old_list;
    }
     
    private String message = "";
    public String getMessage() {
        System.out.println("Get message");
       return message;
    }
    public void setMessage(String s) {
       message = s;
    }   
}
