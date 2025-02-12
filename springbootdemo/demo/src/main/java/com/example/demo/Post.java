package com.example.demo;

public class Post {

	String userid;
	String id;
	String title;
	String body;
	
	public Post() {
		super();
	}

	public final void setUserid(String userid) {
		this.userid = userid;
	}

	public final String getUserid() {
		return userid;
	}

	public final String getId() {
		return id;
	}

	public final void setId(String id) {
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

	@Override
	public String toString() {
		return "Post [userid=" + userid + ", id=" + id + ", title=" + title + ", body=" + body + "]";
	}

	public Post(String userid, String id, String title, String body) {
		super();
		this.userid = userid;
		this.id = id;
		this.title = title;
		this.body = body;
	}
	
	
	
}
