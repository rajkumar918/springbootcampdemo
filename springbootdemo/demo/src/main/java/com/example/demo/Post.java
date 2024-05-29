package com.example.demo;

public class Post {

	int userid;
	int id;
	String title;
	String body;
	
	public Post() {
		super();
	}

	public final int getUserid() {
		return userid;
	}

	public final void setUserid(int userid) {
		this.userid = userid;
	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getTitle() {
		return title;
	}

	public final void setTitle(String title) {
		this.title = title;
	}

	public final String getBody() {
		return body;
	}

	public final void setBody(String body) {
		this.body = body;
	}
	
	
}
