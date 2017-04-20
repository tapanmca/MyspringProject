package com.spbt.rest;

public class Greeting {
	 private  long id;
	    private String content;
	    public Greeting() {
	      
	    }
	    public Greeting(long id, String content) {
	        this.id = id;
	        this.content = content;
	    }
	    public void setId(long id) {
	        this. id=id;
	    }
	    public long getId() {
	        return id;
	    }
	    public void setContent(String conten) {
	        this. content=conten;
	    }
	    public String getContent() {
	        return content;
	    }
}
